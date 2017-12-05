/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.abstractfactory;

/**
 * @author cwenao
 * @version $Id Test.java, v 0.1 2017-12-05 10:35 cwenao Exp $$
 */
public class Test {
    public static void main(String[] args) {
        SkinFactory skinFactory;
        Button button;
        skinFactory = new SpringSkinFactory();
        button = skinFactory.createButton();
        button.dispaly();
    }
}
