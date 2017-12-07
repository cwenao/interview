/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.createpattern.single;

/**
 * @author cwenao
 * @version $Id HungerSingle.java, v 0.1 2017-12-06 10:42 cwenao Exp $$
 */
public class HungerSingle {
    private static final HungerSingle hungerSingle = new HungerSingle();
    private HungerSingle() {
    }

    public static HungerSingle getInstance() {
        return hungerSingle;
    }

}
