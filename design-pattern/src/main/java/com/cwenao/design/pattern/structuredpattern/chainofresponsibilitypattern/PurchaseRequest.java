/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.structuredpattern.chainofresponsibilitypattern;

import java.math.BigDecimal;

/**
 * @author cwenao
 * @version $Id PurchaseRequest.java, v 0.1 2017-12-13 09:39 cwenao Exp $$
 */
public class PurchaseRequest {
    private BigDecimal money;
    private String purchaseCode;
    private String purchaseUsed;

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getPurchaseCode() {
        return purchaseCode;
    }

    public void setPurchaseCode(String purchaseCode) {
        this.purchaseCode = purchaseCode;
    }

    public String getPurchaseUsed() {
        return purchaseUsed;
    }

    public void setPurchaseUsed(String purchaseUsed) {
        this.purchaseUsed = purchaseUsed;
    }
}
