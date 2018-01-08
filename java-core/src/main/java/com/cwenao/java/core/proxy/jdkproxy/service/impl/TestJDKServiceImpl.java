/**
 * Company
 * Copyright (C) 2014-2018 All Rights Reserved.
 */
package com.cwenao.java.core.proxy.jdkproxy.service.impl;

import com.cwenao.java.core.proxy.jdkproxy.service.TestJDKService;

/**
 * @author cwenao
 * @version $Id TestJDKServiceImpl.java, v 0.1 2018-01-08 17:08 cwenao Exp $$
 */
public class TestJDKServiceImpl implements TestJDKService {
    @Override
    public void sayHello(String content) {
        System.out.println("say hello wars  "+content);
    }
}
