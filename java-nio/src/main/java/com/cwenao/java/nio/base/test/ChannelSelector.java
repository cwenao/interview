/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.java.nio.base.test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

/**
 * @author cwenao
 * @version $Id ChannelSelector.java, v 0.1 2017-12-19 11:04 cwenao Exp $$
 */
public class ChannelSelector {
    public static void selector() throws IOException {
        //声明selector
        Selector selector = Selector.open();
        //声明channel
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        //非阻塞模式
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.bind(new InetSocketAddress(9595));
        //将Channel注册到selector
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT );//| SelectionKey.OP_CONNECT | SelectionKey.OP_READ | SelectionKey.OP_WRITE

        while (true) {
            selector.select();
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            Iterator<SelectionKey> keyIterator = selectionKeys.iterator();
            while (keyIterator.hasNext()) {
                SelectionKey key = keyIterator.next();
                System.out.printf(key.toString());
                keyIterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        try {
            selector();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
