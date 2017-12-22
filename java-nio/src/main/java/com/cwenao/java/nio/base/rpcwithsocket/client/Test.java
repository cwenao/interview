/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.java.nio.base.rpcwithsocket.client;

import com.cwenao.java.nio.base.rpcwithsocket.client.proxy.RPCClient;
import com.cwenao.java.nio.base.rpcwithsocket.server.HelloService;
import com.cwenao.java.nio.base.rpcwithsocket.server.Server;
import com.cwenao.java.nio.base.rpcwithsocket.server.impl.HelloServiceImpl;
import com.cwenao.java.nio.base.rpcwithsocket.server.impl.ServerImpl;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * @author cwenao
 * @version $Id Test.java, v 0.1 2017-12-22 09:34 cwenao Exp $$
 */
public class Test {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Server server = new ServerImpl(9590);
                    server.register(HelloService.class, HelloServiceImpl.class);
                    server.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        HelloService helloService = RPCClient.getRemoteProxyObject(HelloService.class, new InetSocketAddress("localhost", 9590));
        System.out.println(helloService.helloWorld("nini"));
    }
}
