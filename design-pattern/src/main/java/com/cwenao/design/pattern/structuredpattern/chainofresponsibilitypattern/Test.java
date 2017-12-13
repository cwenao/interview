/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.structuredpattern.chainofresponsibilitypattern;

import java.math.BigDecimal;

/**
 * @author cwenao
 * @version $Id Test.java, v 0.1 2017-12-13 09:53 cwenao Exp $$
 */
public class Test {
    public static void main(String[] args) {

        Approver employeeApprover = new EmployeeApprover("cwenao");
        Approver chargeApprover = new ChargeApprover("nini");

        employeeApprover.setSuccessor(chargeApprover);

        PurchaseRequest purchaseRequest1 = null;
        purchaseRequest1 = new PurchaseRequest();
        purchaseRequest1.setMoney(new BigDecimal("1000"));
        purchaseRequest1.setPurchaseCode("0001");
        purchaseRequest1.setPurchaseUsed("buy the mac key");

        employeeApprover.processRequest(purchaseRequest1);
        chargeApprover.processRequest(purchaseRequest1);
    }
}
