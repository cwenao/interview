/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.Iteratorpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cwenao
 * @version $Id AbstractObjectList.java, v 0.1 2017-12-14 23:37 cwenao Exp $$
 */
public abstract class AbstractObjectList {
    protected List<Object> objectList = new ArrayList<>();

    public AbstractObjectList(List<Object> objectList) {
        this.objectList = objectList;
    }

    public void addObject(Object o) {
        objectList.add(o);
    }

    public void remove(Object o) {
        objectList.remove(o);
    }

    public List<Object> getObjectList() {
        return this.objectList;
    }
    public abstract AbstractIterator createIterator();
}
