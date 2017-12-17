/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.statepattern;

import java.math.BigDecimal;

/**
 * @author cwenao
 * @version $Id Test.java, v 0.1 2017-12-17 10:31 cwenao Exp $$
 */
public class Test {
    public static void main(String[] args) {
        Account account = new Account("cwenao", new BigDecimal(0).setScale(2,7));
        account.deposit((new BigDecimal(100.09)).setScale(2,6));
        account.deposit(new BigDecimal(10));
    }
}
