/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.createpattern.single;

/**
 * @author cwenao
 * @version $Id LazySingle.java, v 0.1 2017-12-06 10:50 cwenao Exp $$
 */
public class LazySingle {
    private static LazySingle lazySingle;

    private LazySingle() {

    }

    synchronized public static LazySingle getInstance() {
        if (lazySingle == null) {
            lazySingle = new LazySingle();
        }
        return lazySingle;
    }
}

