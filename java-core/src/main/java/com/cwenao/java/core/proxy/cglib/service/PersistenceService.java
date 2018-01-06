/**
 * Company
 * Copyright (C) 2014-2018 All Rights Reserved.
 */
package com.cwenao.java.core.proxy.cglib.service;

import com.cwenao.java.core.proxy.cglib.pojo.UserInfo;

/**
 * @author cwenao
 * @version $Id PersistenceService.java, v 0.1 2018-01-06 12:57 cwenao Exp $$
 */
public interface PersistenceService {
    void save(int id, UserInfo data);

    String load(int id);
}
