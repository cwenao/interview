/**
 * Company
 * Copyright (C) 2014-2018 All Rights Reserved.
 */
package com.cwenao.java.core.proxy.cglib.service.impl;

import com.cwenao.java.core.proxy.cglib.service.AuthorizationService;

import java.lang.reflect.Method;

/**
 * @author cwenao
 * @version $Id AuthorizationServiceImpl.java, v 0.1 2018-01-06 16:09 cwenao Exp $$
 */
public class AuthorizationServiceImpl implements AuthorizationService{

    private static final String SAVE = "save";

    @Override
    public void authorize(Method method) {
        String methodName = method.getName();

        if (SAVE.equalsIgnoreCase(methodName)) {
            System.out.println("that to check the data when to save =======> ");
        }

    }
}
