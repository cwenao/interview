/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.createpattern.single;

/**
 * @author cwenao
 * @version $Id IoDHSingle.java, v 0.1 2017-12-06 11:00 cwenao Exp $$
 */
public class IoDHSingle {
    private IoDHSingle() {

    }

    /**
     * IoDH: Initialization Demand Holder
     */
    private static class InitIoDHSingle {
        private static final IoDHSingle iodhSingle = new IoDHSingle();
    }

    public static IoDHSingle getInstance() {
        return InitIoDHSingle.iodhSingle;
    }
}
