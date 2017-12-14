/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.Iteratorpattern;

import java.util.List;

/**
 * @author cwenao
 * @version $Id ProductIterator.java, v 0.1 2017-12-14 23:42 cwenao Exp $$
 */
public class ProductIterator implements AbstractIterator {

    private ProductList productList;
    private List products;
    private int cursor;

    public ProductIterator(ProductList productList) {
        this.productList = productList;
        this.products = productList.getObjectList();
        cursor = 0;
    }

    @Override
    public boolean isFirst() {
        return cursor == 0;
    }

    @Override
    public boolean isLast() {
        return cursor == (products.size() - 1);
    }

    @Override
    public boolean hasNext() {
        return cursor >= 0 && cursor <= (products.size() - 1);
    }

    @Override
    public Object next() {
        Object next = products.get(cursor);
        cursor++;
        return next;
    }
}
