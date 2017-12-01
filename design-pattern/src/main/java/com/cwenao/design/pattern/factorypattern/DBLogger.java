/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.factorypattern;

/**
 * @author cwenao
 * @version $Id DBLogger.java, v 0.1 2017-12-02 12:10 cwenao Exp $$
 */
public class DBLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("this is the DBLogger........");
    }
}
