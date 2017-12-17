/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.statepattern;

import java.math.BigDecimal;

/**
 * @author cwenao
 * @version $Id AccountState.java, v 0.1 2017-12-17 10:12 cwenao Exp $$
 */
public abstract class AccountState {
    protected Account account;

    public abstract void deposit(BigDecimal account);

    public abstract void withdraw(BigDecimal account);

    public abstract void computeInterest();

    public abstract void stateCheck();
}
