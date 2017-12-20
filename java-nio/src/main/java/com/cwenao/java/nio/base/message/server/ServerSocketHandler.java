/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.java.nio.base.message.server;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author cwenao
 * @version $Id ServerSocketHandler.java, v 0.1 2017-12-19 17:20 cwenao Exp $$
 */
public abstract class ServerSocketHandler {

    private Selector conn_selector;

    private Selector read_selector;

    private volatile Boolean isStop = false;

    public  Map<String, ClientInfo> clientInfoMap = new HashMap<>();

    public Object lock = new Object();

    public void connectHandler() {
        while (!isStop) {
            try {
                conn_selector.select();
            } catch (IOException e) {
                e.printStackTrace();
                continue;
            }
            Iterator<SelectionKey> selectionKeyIterator = conn_selector.selectedKeys().iterator();

            while (selectionKeyIterator.hasNext()) {
                SelectionKey selectionKey = selectionKeyIterator.next();
                selectionKeyIterator.remove();

                if (selectionKey.isAcceptable()) {
                    try {
                        SocketChannel newConn = ((ServerSocketChannel) selectionKey.channel()).accept();
                        newInConnHandler(newConn);
                    } catch (IOException e) {
                        e.printStackTrace();
                        continue;
                    }
                } else {
                    try {
                        dataHandler((SocketChannel) selectionKey.channel());
                    } catch (IOException e) {
                        e.printStackTrace();
                        continue;
                    }
                }
            }
        }
    }

    private void newInConnHandler(SocketChannel newConn) {
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

    public void dataReceiveHandler() {
        while (true) {
            synchronized (lock) {

            }
            try {
                read_selector.select();
            } catch (IOException e) {
                e.printStackTrace();
                continue;
            }

            Iterator<SelectionKey> selectionKeyIterator = read_selector.selectedKeys().iterator();
            while (selectionKeyIterator.hasNext()) {
                SelectionKey con = selectionKeyIterator.next();
                selectionKeyIterator.remove();
                try {
                    if (con.isReadable()) {
                        dataHandler((SocketChannel) con.channel());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }
    }

    public abstract void dataHandler(SocketChannel dataChannel) throws IOException;

    public Selector getRead_selector() {
        return read_selector;
    }

    public void setRead_selector(Selector read_selector) {
        this.read_selector = read_selector;
    }
}
