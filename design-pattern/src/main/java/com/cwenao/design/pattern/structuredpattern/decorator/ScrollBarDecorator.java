/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.structuredpattern.decorator;

/**
 * @author cwenao
 * @version $Id ScrollBarDecorator.java, v 0.1 2017-12-10 06:15 cwenao Exp $$
 */
public class ScrollBarDecorator extends ComponentDecorator {
    public ScrollBarDecorator(Component component) {
        super(component);
    }

    public void display() {
        this.setScrollBar();
        super.display();
    }

    private void setScrollBar() {
        System.out.println("to add the scorll bar for display()");
    }

}
