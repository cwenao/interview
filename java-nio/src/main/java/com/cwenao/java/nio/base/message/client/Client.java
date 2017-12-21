/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.java.nio.base.message.client;

import com.alibaba.fastjson.JSONObject;
import com.cwenao.java.nio.base.message.pojo.Message;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author cwenao
 * @version $Id Client.java, v 0.1 2017-12-20 14:34 cwenao Exp $$
 */
public class Client {
    private String fromUser;
    private String toUser;

    private Selector selector;

    private ByteBuffer writeBuffer = ByteBuffer.allocate(512);

    private SocketChannel channel;

    private Object lock = new Object();

    private volatile boolean isInit = false;

    public Client(String fromUser, String toUser) {
        this.fromUser = fromUser;
        this.toUser = toUser;
    }

    public void initClient(String ip, int port) throws IOException {
        channel = SocketChannel.open();
        channel.configureBlocking(false);

        this.selector = Selector.open();

        channel.connect(new InetSocketAddress(ip, port));
        channel.register(this.selector, SelectionKey.OP_CONNECT);
    }

    public void listen() throws IOException {
        while (true) {
            synchronized (lock) {

            }
            this.selector.select();
            Iterator<SelectionKey> selectionKeyIterator = this.selector.selectedKeys().iterator();
            while (selectionKeyIterator.hasNext()) {
                SelectionKey conn = selectionKeyIterator.next();
                selectionKeyIterator.remove();

                if (conn.isConnectable()) {
                    SocketChannel socketChannel = (SocketChannel) conn.channel();
                    if (socketChannel.isConnectionPending()) {
                        socketChannel.finishConnect();
                    }
                    socketChannel.configureBlocking(false);
                    socketChannel.register(this.selector, SelectionKey.OP_READ);
                    isInit = true;
                } else {
                    read(conn);
                }
            }
        }
    }

    public void read(SelectionKey selectionKey) throws IOException {

        SocketChannel data = (SocketChannel) selectionKey.channel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(512);

        try {
            data.read(byteBuffer);
        } catch (IOException e) {
            e.printStackTrace();
            data.close();
            return;
        }

        byteBuffer.flip();

        byte[] msg = new byte[byteBuffer.limit()];
        byteBuffer.get(msg);
        byteBuffer.clear();

        Message message = JSONObject.parseObject(new String(msg), Message.class);
        System.out.println("get the message from " + message.getFromUser() + " the content is : " + message.getMsgData());

    }

    public void sendMsg(String content) {
        writeBuffer.put(content.getBytes());
        writeBuffer.flip();

        while (writeBuffer.hasRemaining()) {
            try {
                channel.write(writeBuffer);
            } catch (IOException e) {
                e.printStackTrace();
                continue;
            }
        }
        writeBuffer.clear();
    }

    public void start(String hostname, int port) throws IOException {

        initClient(hostname, port);
        new Thread("reading"){
            public void run() {
                try {
                    listen();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        Message message = new Message();

        message.setFromUser(this.fromUser);
        message.setMsgType("0");
        message.setMsgData("register");

        String sendMessage = JSONObject.toJSONString(message);
        sendMsg(sendMessage);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String content = "";

        System.out.println("please input the message to send..., and input 'quit--' to quit the send model");

        Scanner scanner = new Scanner(System.in);

        Message sendm = new Message();
        sendm.setMsgType("1");
        sendm.setFromUser(this.fromUser);
        sendm.setToUser(this.toUser);

        while (!"quit--".equalsIgnoreCase(content) && scanner.hasNext()) {
            content = scanner.next();
            sendm.setMsgData(content);
            sendMsg(JSONObject.toJSONString(sendm));

            if ("quit--".equalsIgnoreCase(content)) {
                continue;
            }
        }
        channel.close();
    }
}
