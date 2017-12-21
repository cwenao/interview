/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.java.nio.base.message.server;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;

/**
 * @author cwenao
 * @version $Id ClientInfo.java, v 0.1 2017-12-20 11:09 cwenao Exp $$
 */
public class ClientInfo {
    private String fromUser;

    private String toUser;

    private SocketChannel channel;

    public ClientInfo(String fromUser, String data, SocketChannel dataChannel) {
        this.fromUser = fromUser;
        //initClient(selector);
        this.channel = dataChannel;
    }

//    private void initClient(Selector selector) {
//        try {
//            channel = SocketChannel.open();
//            channel.configureBlocking(false);
//            channel.register(selector, SelectionKey.OP_READ);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public String getFromUser() {
        return fromUser;
    }

    public void setFromUser(String fromUser) {
        this.fromUser = fromUser;
    }

    public String getToUser() {
        return toUser;
    }

    public void setToUser(String toUser) {
        this.toUser = toUser;
    }

    public SocketChannel getChannel() {
        return channel;
    }

    public void setChannel(SocketChannel socketChannel) {
        this.channel = socketChannel;
    }
}
