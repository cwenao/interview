/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.structuredpattern.flyweightpattern;

/**
 * @author cwenao
 * @version $Id IgoChessman.java, v 0.1 2017-12-12 22:40 cwenao Exp $$
 */
public abstract class IgoChessman {
    public abstract String getColor();

    public void display() {
        System.out.println("the chessman color: " + this.getColor());
    }
}
