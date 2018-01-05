/**
 * Company
 * Copyright (C) 2014-2018 All Rights Reserved.
 */
package com.cwenao.java.core.proxy.cglib.service;

import java.lang.reflect.Method;

/**
 * @author cwenao
 * @version $Id AuthorizationService.java, v 0.1 2018-01-05 15:01 cwenao Exp $$
 */
public interface AuthorizationService {
    void authorize(Method method);
}
