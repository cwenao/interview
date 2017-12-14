/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.Iteratorpattern;

import java.util.List;

/**
 * @author cwenao
 * @version $Id ProductList.java, v 0.1 2017-12-14 23:43 cwenao Exp $$
 */
public class ProductList extends AbstractObjectList{

    public ProductList(List products) {
        super(products);
    }

    @Override
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }
}
