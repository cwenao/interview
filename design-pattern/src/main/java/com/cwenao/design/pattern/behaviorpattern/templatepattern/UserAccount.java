/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.templatepattern;

import java.math.BigDecimal;

/**
 * @author cwenao
 * @version $Id UserAccount.java, v 0.1 2017-12-17 13:59 cwenao Exp $$
 */
public abstract class UserAccount {
    private BigDecimal balance;
    private String userId;

    public abstract void calculation();

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
