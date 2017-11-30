/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.simplefactory;

import static com.cwenao.design.pattern.simplefactory.SimpleFactory.getProduct;

/**
 * @author cwenao
 * @version $Id Test.java, v 0.1 2017-11-30 13:53 cwenao Exp $$
 */
public class Test {
    public static void main(String[] args) {

        //call simple factory
        getProduct("cwenao");
        System.out.println("---------------------------------");
        getProduct("nini");

        Chart chart = SimpleFactory.getChart("nini");
        chart.display();

    }
}
