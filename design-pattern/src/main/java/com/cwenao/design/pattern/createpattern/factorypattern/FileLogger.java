/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.createpattern.factorypattern;

/**
 * @author cwenao
 * @version $Id FileLogger.java, v 0.1 2017-12-02 12:09 cwenao Exp $$
 */
public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("This is the FileLogger........");

    }
}
