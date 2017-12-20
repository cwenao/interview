/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.java.nio.base.message.server;

import com.alibaba.fastjson.JSONObject;
import com.cwenao.java.nio.base.message.pojo.Message;
import com.sun.deploy.util.StringUtils;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * @author cwenao
 * @version $Id DataHandler.java, v 0.1 2017-12-19 17:44 cwenao Exp $$
 */
public class DataHandler extends ServerSocketHandler{

    @Override
    public void dataHandler(SocketChannel dataChannel) throws IOException{

        ByteBuffer byteBuffer = ByteBuffer.allocate(512);

        if (dataChannel.read(byteBuffer) == -1) {
            dataChannel.close();
        }

        byteBuffer.flip();
        byte[] msg = new byte[byteBuffer.limit()];
        byteBuffer.get(msg);

        Message message = JSONObject.parseObject(new String(msg), Message.class);
        if (message == null) {
            dataChannel.close();
            return;
        }

        if ("0".equalsIgnoreCase(message.getMsgType())) {
            System.out.printf("this is the register: " + message.getFromUser() + " and the data: " + message.getMsgData());

            ClientInfo clientInfo = new ClientInfo(message.getFromUser(), message.getMsgData());
            this.clientInfoMap.put(message.getFromUser(), clientInfo);

        } else {
            System.out.printf("receive the message: "+message.getMsgData()+" from "+message.getFromUser());
            byteBuffer.rewind();

            if (message.getToUser() != null && !"".equalsIgnoreCase(message.getToUser())) {
                SocketChannel sendChannel = this.clientInfoMap.get(message.getToUser()).getChannel();
                try {
                    while (byteBuffer.hasRemaining()) {
                        sendChannel.write(byteBuffer);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }finally {
                    byteBuffer.clear();
                }
            }
        }

    }
}
