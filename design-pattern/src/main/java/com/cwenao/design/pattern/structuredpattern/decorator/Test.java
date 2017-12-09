/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.structuredpattern.decorator;

/**
 * @author cwenao
 * @version $Id Test.java, v 0.1 2017-12-10 06:17 cwenao Exp $$
 */
public class Test {
    public static void main(String[] args) {
        Component component = new MacBox();
        Component decorator = new ScrollBarDecorator(component);
        decorator.display();
    }


}
