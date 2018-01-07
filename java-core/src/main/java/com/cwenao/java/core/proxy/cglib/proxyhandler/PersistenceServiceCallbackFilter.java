/**
 * Company
 * Copyright (C) 2014-2018 All Rights Reserved.
 */
package com.cwenao.java.core.proxy.cglib.proxyhandler;

import net.sf.cglib.proxy.CallbackFilter;

import java.lang.reflect.Method;

/**
 * @author cwenao
 * @version $Id PersistenceServiceCallbackFilter.java, v 0.1 2018-01-07 09:32 cwenao Exp $$
 */
public class PersistenceServiceCallbackFilter implements CallbackFilter{

    private static final int SAVE = 0;

    private static final int LOAD = 1;

    private static final String OP_SAVE = "save";

    @Override
    public int accept(Method method) {

        String methodName = method.getName();

        if (OP_SAVE.equalsIgnoreCase(methodName)) {
            System.out.println("this is call back for filter...");
            return SAVE;
        }

        return 1;
    }
}
