/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.templatepattern;

import java.math.BigDecimal;

/**
 * @author cwenao
 * @version $Id Test.java, v 0.1 2017-12-17 14:28 cwenao Exp $$
 */
public class Test {
    public static void main(String[] args) {
        UserAccount userAccount = new TimeDepositInterest("cwenao", new BigDecimal(1000));
        userAccount.calculation();
    }
}
