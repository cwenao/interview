/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.factorypattern;

/**
 * @author cwenao
 * @version $Id Test.java, v 0.1 2017-12-03 06:17 cwenao Exp $$
 */
public class Test {
    public static void main(String[] args) {
        LoggerFactory loggerFactory;
        Logger logger;
        loggerFactory = new FileLoggerFactory();
        logger = loggerFactory.createLogger();
        logger.writeLog();
    }
}
