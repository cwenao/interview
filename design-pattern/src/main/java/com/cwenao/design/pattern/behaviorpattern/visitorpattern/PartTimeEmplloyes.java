/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.visitorpattern;

import java.math.BigDecimal;

/**
 * @author cwenao
 * @version $Id PartTimeEmplloyes.java, v 0.1 2017-12-17 14:57 cwenao Exp $$
 */
public class PartTimeEmplloyes implements Employes{
    private String userName;
    private BigDecimal wage;
    private int workTime;

    @Override
    public void accept(Department department) {
        department.visitor(this);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public BigDecimal getWage() {
        return wage;
    }

    public void setWage(BigDecimal wage) {
        this.wage = wage;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }
}
