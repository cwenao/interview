/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.statepattern;

import java.math.BigDecimal;

/**
 * @author cwenao
 * @version $Id Account.java, v 0.1 2017-12-17 10:11 cwenao Exp $$
 */
public class Account {
    private AccountState accountState;
    private String userId;
    private BigDecimal balance = new BigDecimal(0).setScale(8);

    public Account(String userId, BigDecimal balance) {
        this.userId = userId;
        this.balance = balance;

        accountState = new NormalAccountState(this);
    }

    public AccountState getAccountState() {
        return accountState;
    }

    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
