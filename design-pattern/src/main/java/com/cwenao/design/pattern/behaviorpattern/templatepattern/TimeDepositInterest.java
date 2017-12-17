/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.templatepattern;

import java.math.BigDecimal;

/**
 * @author cwenao
 * @version $Id TimeDepositInterest.java, v 0.1 2017-12-17 14:03 cwenao Exp $$
 */
public class TimeDepositInterest extends UserAccount{

    public TimeDepositInterest(String userId, BigDecimal balance) {
        this.setUserId(userId);
        this.setBalance(balance);
    }
    @Override
    public void calculation() {
        System.out.println("this is the time deposit interest: userId is "+this.getUserId()+"  the balance is : "+this.getBalance());
    }
}
