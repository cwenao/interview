/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.structuredpattern.decorator;

/**
 * @author cwenao
 * @version $Id ComponentDecorator.java, v 0.1 2017-12-10 06:12 cwenao Exp $$
 */
public class ComponentDecorator implements  Component{

    private Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}
