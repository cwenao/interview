/**
 * Company
 * Copyright (C) 2014-2018 All Rights Reserved.
 */
package com.cwenao.java.core.proxy.jdkproxy;

import com.cwenao.java.core.proxy.jdkproxy.handler.JDKProxyHandler;
import com.cwenao.java.core.proxy.jdkproxy.service.TestJDKService;
import com.cwenao.java.core.proxy.jdkproxy.service.impl.TestJDKServiceImpl;

/**
 * @author cwenao
 * @version $Id Test.java, v 0.1 2018-01-08 17:16 cwenao Exp $$
 */
public class Test {

    public static void main(String[] args) {
        TestJDKService testJDKService = JDKProxyHandler.getNewInstanceWithJDKProxy(TestJDKService.class, "aaa");
        testJDKService.sayHello("aaaaaaaa");

    }
}
