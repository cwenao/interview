/**
 * Company
 * Copyright (C) 2014-2018 All Rights Reserved.
 */
package com.cwenao.java.core.proxy.cglib.proxyhandler;

import com.cwenao.java.core.proxy.cglib.service.AuthorizationService;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author cwenao
 * @version $Id AuthorizationInterceptor.java, v 0.1 2018-01-05 15:17 cwenao Exp $$
 */
public class AuthorizationInterceptor implements MethodInterceptor{

    private AuthorizationService authorizationService;

    public AuthorizationInterceptor(AuthorizationService authorizationService) {
        this.authorizationService = authorizationService;
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {

        if (authorizationService !=null) {
            authorizationService.authorize(method);
        }

        return proxy.invokeSuper(obj,args);
    }
}
