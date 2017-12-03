/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.factorypattern;

/**
 * @author cwenao
 * @version $Id DBLoggerFactory.java, v 0.1 2017-12-03 06:15 cwenao Exp $$
 */
public class DBLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        System.out.println("this is db logger factory");

        Logger logger = new DBLogger();
        return logger;
    }

    @Override
    public Logger createLogger(String args) {
        System.out.println("this is the args" + args);
        Logger logger = new DBLogger();
        return logger;
    }

    @Override
    public Logger createLogger(Object object) {
        System.out.println("this is obj for create logger");
        Logger logger = new DBLogger();
        return logger;
    }
}
