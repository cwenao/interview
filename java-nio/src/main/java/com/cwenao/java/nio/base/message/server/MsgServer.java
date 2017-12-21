/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.java.nio.base.message.server;

import java.io.IOException;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * @author cwenao
 * @version $Id MsgServer.java, v 0.1 2017-12-20 14:09 cwenao Exp $$
 */
public class MsgServer {
    public static void main(String[] args) {

        final DataHandler dataHandler = new DataHandler();
        dataHandler.init();
        new Thread("receive the data...."){
            public void run() {
                dataHandler.dataReceiveHandler();
            }
        }.start();

        dataHandler.connectHandler();
    }
}
