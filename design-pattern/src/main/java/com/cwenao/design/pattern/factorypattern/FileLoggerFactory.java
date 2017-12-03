/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.factorypattern;

/**
 * @author cwenao
 * @version $Id FileLoggerFactory.java, v 0.1 2017-12-03 06:12 cwenao Exp $$
 */
public class FileLoggerFactory implements LoggerFactory{
    @Override
    public Logger createLogger() {
        System.out.println("this is file logger factory");
        Logger logger = new FileLogger();
        return logger;
    }

    @Override
    public Logger createLogger(String args) {
        System.out.println("this is the args" + args);
        Logger logger = new FileLogger();
        return logger;
    }

    @Override
    public Logger createLogger(Object object) {
        System.out.println("this is obj for create logger");
        Logger logger = new FileLogger();
        return logger;
    }
}
