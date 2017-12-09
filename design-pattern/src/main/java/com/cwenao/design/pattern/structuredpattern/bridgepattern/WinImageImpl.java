/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.structuredpattern.bridgepattern;

/**
 * @author cwenao
 * @version $Id WinImageImpl.java, v 0.1 2017-12-09 14:50 cwenao Exp $$
 */
public class WinImageImpl implements ImageImpl{
    @Override
    public void display(Matrix matrix) {
        System.out.println("this is the win impl: " );
    }
}
