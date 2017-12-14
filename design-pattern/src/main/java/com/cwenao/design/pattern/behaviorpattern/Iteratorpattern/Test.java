/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.Iteratorpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cwenao
 * @version $Id Test.java, v 0.1 2017-12-14 23:52 cwenao Exp $$
 */
public class Test {
    public static void main(String[] args) {
        List<Object> products = new ArrayList<>();
        products.add("555");
        products.add("26利群");
        products.add("中华");

        AbstractObjectList abstractObjectList = new ProductList(products);
        AbstractIterator abstractIterator = abstractObjectList.createIterator();

        while (abstractIterator.hasNext()) {
            System.out.println(abstractIterator.next());
        }
    }
}
