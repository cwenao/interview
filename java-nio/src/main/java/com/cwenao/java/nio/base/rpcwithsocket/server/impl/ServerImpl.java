/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.java.nio.base.rpcwithsocket.server.impl;

import com.cwenao.java.nio.base.rpcwithsocket.server.Server;
import com.cwenao.java.nio.base.rpcwithsocket.server.ServerTask;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author cwenao
 * @version $Id ServerImpl.java, v 0.1 2017-12-21 15:59 cwenao Exp $$
 */
public class ServerImpl implements Server{

    private static ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    private static final HashMap<String, Class> services = new HashMap<>();

    private static boolean isRunning = false;

    private static int port;

    public ServerImpl(int port) {
        this.port = port;
    }

    @Override
    public void start() throws IOException {

        ServerSocket serverSocket = new ServerSocket();
        serverSocket.bind(new InetSocketAddress(port));
        System.out.printf("starting the server...");

        try {
            while (true) {
                executorService.execute(new ServerTask(serverSocket.accept()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            serverSocket.close();
        }
    }

    @Override
    public void stop() {
        this.isRunning = false;
        executorService.shutdown();
    }

    @Override
    public void register(Class serviceInterface, Class impl) {
        services.put(serviceInterface.getName(), impl);
    }

    @Override
    public boolean isRunning() {
        return this.isRunning;
    }

    @Override
    public int getPort() {

        return port;
    }

    public static HashMap<String, Class> getServices() {
        return services;
    }
}
