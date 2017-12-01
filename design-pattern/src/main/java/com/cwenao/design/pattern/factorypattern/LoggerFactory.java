/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.factorypattern;

/**
 * @author cwenao
 * @version $Id LoggerFactory.java, v 0.1 2017-12-02 12:06 cwenao Exp $$
 */
public interface LoggerFactory {
    Logger createLogger();

    Logger createLogger(String args);

    Logger createLogger(Object object);
}
