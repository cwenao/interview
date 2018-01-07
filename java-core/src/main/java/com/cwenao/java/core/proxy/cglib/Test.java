/**
 * Company
 * Copyright (C) 2014-2018 All Rights Reserved.
 */
package com.cwenao.java.core.proxy.cglib;

import com.cwenao.java.core.proxy.cglib.pojo.UserInfo;
import com.cwenao.java.core.proxy.cglib.proxyhandler.AuthorizationInterceptor;
import com.cwenao.java.core.proxy.cglib.proxyhandler.PersistenceServiceCallbackFilter;
import com.cwenao.java.core.proxy.cglib.service.AuthorizationService;
import com.cwenao.java.core.proxy.cglib.service.PersistenceService;
import com.cwenao.java.core.proxy.cglib.service.impl.AuthorizationServiceImpl;
import com.cwenao.java.core.proxy.cglib.service.impl.PersistenceServiceImpl;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.CallbackFilter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

/**
 * @author cwenao
 * @version $Id Test.java, v 0.1 2018-01-07 10:10 cwenao Exp $$
 */
public class Test {

    public PersistenceServiceImpl testCreateCGLib() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(PersistenceServiceImpl.class);

        CallbackFilter callbackFilter = new PersistenceServiceCallbackFilter();
        enhancer.setCallbackFilter(callbackFilter);

        AuthorizationService authorizationService = new AuthorizationServiceImpl();
        Callback saveCallback = new AuthorizationInterceptor(authorizationService);
        Callback loadCallback = NoOp.INSTANCE;

        Callback[] callbacks = new Callback[]{saveCallback, loadCallback};

        enhancer.setCallbacks(callbacks);

        return (PersistenceServiceImpl) enhancer.create();
    }

    public static void main(String[] args) {

        Test test = new Test();

        UserInfo userInfo = new UserInfo();
        userInfo.setId(1);
        userInfo.setNickName("cwenao");
        userInfo.setHobby("hahahahahaha");

        PersistenceService persistenceService = test.testCreateCGLib();
        persistenceService.save(1, userInfo);

        persistenceService.save(1, userInfo);
    }
}
