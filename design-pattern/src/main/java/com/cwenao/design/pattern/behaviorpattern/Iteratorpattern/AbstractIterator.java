/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.Iteratorpattern;

/**
 * @author cwenao
 * @version $Id AbstractIterator.java, v 0.1 2017-12-14 23:34 cwenao Exp $$
 */
public interface AbstractIterator {

    boolean isFirst();

    boolean isLast();

    boolean hasNext();

    Object next();
}
