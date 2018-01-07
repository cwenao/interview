/**
 * Company
 * Copyright (C) 2014-2018 All Rights Reserved.
 */
package com.cwenao.java.core.proxy.cglib.service.impl;

import com.cwenao.java.core.proxy.cglib.pojo.UserInfo;
import com.cwenao.java.core.proxy.cglib.service.PersistenceService;

/**
 * @author cwenao
 * @version $Id PersistenceServiceImpl.java, v 0.1 2018-01-06 13:58 cwenao Exp $$
 */
public class PersistenceServiceImpl implements PersistenceService{
    @Override
    public void save(int id, UserInfo data) {
        System.out.println("this is the userInfo: nickName is "+data.getNickName()+" and id is "+data.getId());
    }

    @Override
    public String load(int id) {
        return " user id is: " + id;
    }
}
