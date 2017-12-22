/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.java.nio.base.rpcwithsocket.server.impl;

import com.cwenao.java.nio.base.rpcwithsocket.server.HelloService;

/**
 * @author cwenao
 * @version $Id HelloServiceImpl.java, v 0.1 2017-12-21 15:55 cwenao Exp $$
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String helloWorld(String userName) {
        return "Hello World " + userName;
    }
}
