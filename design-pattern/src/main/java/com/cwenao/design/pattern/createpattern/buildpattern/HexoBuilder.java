/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.createpattern.buildpattern;

/**
 * @author cwenao
 * @version $Id HexoBuilder.java, v 0.1 2017-12-09 08:36 cwenao Exp $$
 */
public class HexoBuilder extends AbstractBuilder{
    @Override
    public void buileType() {
        actor.setType("HEXO");
    }

    @Override
    public void buildSex() {
        actor.setSex(0);
    }
}
