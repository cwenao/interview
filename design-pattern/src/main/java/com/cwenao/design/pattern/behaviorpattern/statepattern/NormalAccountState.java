/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.statepattern;

import java.math.BigDecimal;

/**
 * @author cwenao
 * @version $Id NormalAccountState.java, v 0.1 2017-12-17 10:20 cwenao Exp $$
 */
public class NormalAccountState extends AccountState{

    public NormalAccountState(Account account) {
        this.account = account;
    }

    public NormalAccountState(AccountState accountState) {
        this.account = accountState.account;
    }

    @Override
    public void deposit(BigDecimal account) {

    }

    @Override
    public void withdraw(BigDecimal account) {

    }

    @Override
    public void computeInterest() {

    }

    @Override
    public void stateCheck() {

    }
}
