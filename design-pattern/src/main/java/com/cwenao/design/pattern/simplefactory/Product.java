/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.simplefactory;

/**
 * @author cwenao
 * @version $Id Product.java, v 0.1 2017-11-30 11:27 cwenao Exp $$
 */
public abstract class Product {

    public final static String TYPE_NINI = "nini";

    public static boolean checkType(String type) {
        if (TYPE_NINI.endsWith(type)) {
            return true;
        }
        return false;
    }

    abstract void methodDiff();
}
