/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.java.nio.base.rpc.rpcwithsocket.server;

import com.cwenao.java.nio.base.rpc.rpcwithsocket.server.impl.ServerImpl;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;

/**
 * @author cwenao
 * @version $Id ServerTask.java, v 0.1 2017-12-21 16:14 cwenao Exp $$
 */
public class ServerTask implements Runnable{

    private Socket socket = null;

    public ServerTask(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        ObjectInputStream objectInputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {
            //反序列化
            objectInputStream = new ObjectInputStream(socket.getInputStream());
            String serviceName = objectInputStream.readUTF();
            Class serviceClass = null;
            if ((serviceClass = ServerImpl.getServices().get(serviceName)) == null) {
                throw new ClassNotFoundException("Class " + serviceName + " is not found");
            }
            String methodName = objectInputStream.readUTF();

            Class<?>[] parameterTypes = (Class<?>[]) objectInputStream.readObject();
            Object[] arguments = (Object[]) objectInputStream.readObject();

            Method method = serviceClass.getMethod(methodName, parameterTypes);

            Object object = method.invoke(serviceClass.newInstance(), arguments);

            objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            objectOutputStream.writeObject(object);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }finally {
            if (objectInputStream != null) {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (objectOutputStream !=null) {
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
