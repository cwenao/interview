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
 * @version $Id ServerSocketHandler.java, v 0.1 2017-12-19 17:20 cwenao Exp $$
 */
public abstract class ServerSocketHandler {

    private Selector read_selector;

    private Object lock = new Object();

    public void newInConnHandler(SocketChannel newConn) {
        try {
            newConn.configureBlocking(false);
            synchronized (lock) {
                this.read_selector.wakeup();
                newConn.register(this.read_selector, SelectionKey.OP_READ);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract void dataHandler(SocketChannel data);

    public Selector getRead_selector() {
        return read_selector;
    }

    public void setRead_selector(Selector read_selector) {
        this.read_selector = read_selector;
    }
}
