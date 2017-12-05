/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.abstractfactory;

/**
 * @author cwenao
 * @version $Id SpringButton.java, v 0.1 2017-12-05 10:31 cwenao Exp $$
 */
public class SpringButton implements Button {
    @Override
    public void dispaly() {
        System.out.println("this is the spring button");
    }
}
