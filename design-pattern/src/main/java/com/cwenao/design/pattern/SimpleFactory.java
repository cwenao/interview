/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern;

/**
 * @author cwenao
 * @version $Id SimpleFactory.java, v 0.1 2017-10-21 16:02 cwenao Exp $$
 */
public class SimpleFactory {
    public static void getProduct(String type) {

        if (!Product.checkType(type)) {
            System.out.println("this is not in product list");
            return;
        }
        Product product = null;
        if (Product.TYPE_NINI.equals(type)) {
            product = new HistogramProduct();
            product.methodDiff();
        }
    }
}
