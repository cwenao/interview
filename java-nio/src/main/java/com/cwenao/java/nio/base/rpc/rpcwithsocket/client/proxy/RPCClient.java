/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.java.nio.base.rpc.rpcwithsocket.client.proxy;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * @author cwenao
 * @version $Id RPCClient.java, v 0.1 2017-12-21 16:49 cwenao Exp $$
 */
public class RPCClient {
    public static <T> T getRemoteProxyObject(final Class<?> serviceInterface, final InetSocketAddress address) {
        return (T) Proxy.newProxyInstance(serviceInterface.getClassLoader(), new Class<?>[]{serviceInterface}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                Socket socket = null;
                ObjectInputStream objectInputStream = null;
                ObjectOutputStream objectOutputStream = null;

                try{
                    socket = new Socket();
                    socket.connect(address);

                    objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                    objectOutputStream.writeUTF(serviceInterface.getName());
                    objectOutputStream.writeUTF(method.getName());
                    objectOutputStream.writeObject(method.getParameterTypes());
                    objectOutputStream.writeObject(args);

                    objectInputStream = new ObjectInputStream(socket.getInputStream());

                    return objectInputStream.readObject();

                }finally {
                    if (socket != null) {
                        socket.close();
                    }

                    if (objectInputStream !=null) {
                        objectInputStream.close();
                    }

                    if (objectOutputStream !=null) {
                        objectOutputStream.close();
                    }
                }
            }
        });
    }
}
