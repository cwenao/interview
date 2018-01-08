/**
 * Company
 * Copyright (C) 2014-2018 All Rights Reserved.
 */
package com.cwenao.java.core.proxy.jdkproxy.handler;

import com.cwenao.java.core.proxy.jdkproxy.service.impl.TestJDKServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author cwenao
 * @version $Id JDKProxyHandler.java, v 0.1 2018-01-08 11:28 cwenao Exp $$
 */
public class JDKProxyHandler {

    public static <T> T getNewInstanceWithJDKProxy(final Class<?> serviceInterface, String say) {

        return (T)Proxy.newProxyInstance(serviceInterface.getClassLoader(), new Class<?>[]{serviceInterface}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                System.out.println("do pre~~~~~~~~~~~~~~~");

                Object obj = method.invoke(TestJDKServiceImpl.class.newInstance(), args);

                System.out.println("off...........");

                return obj;
            }
        });

    }

}
