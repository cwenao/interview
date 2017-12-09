/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.createpattern.buildpattern;

/**
 * @author cwenao
 * @version $Id AbstractBuilder.java, v 0.1 2017-12-09 08:32 cwenao Exp $$
 */
public abstract class AbstractBuilder {
    protected Actor actor = new Actor();

    public abstract void buileType();

    public abstract void buildSex();

    public Actor createActor() {
        return actor;
    }
}
