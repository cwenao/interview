/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.observerpattern;

/**
 * @author cwenao
 * @version $Id Observer.java, v 0.1 2017-12-16 10:47 cwenao Exp $$
 */
public interface Observer {
    public String getName();

    public void setName(String name);

    public void help();

    public void beAttacked(AllyController allyController);
}
