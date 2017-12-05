/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.abstractfactory;

/**
 * @author cwenao
 * @version $Id SpringSkinFactory.java, v 0.1 2017-12-05 10:34 cwenao Exp $$
 */
public class SpringSkinFactory implements SkinFactory{
    @Override
    public Button createButton() {
        return new SpringButton();
    }
}
