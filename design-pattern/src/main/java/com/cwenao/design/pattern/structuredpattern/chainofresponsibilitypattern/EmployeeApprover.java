/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.structuredpattern.chainofresponsibilitypattern;

/**
 * @author cwenao
 * @version $Id EmployeeApprover.java, v 0.1 2017-12-13 09:48 cwenao Exp $$
 */
public class EmployeeApprover extends Approver{

    public EmployeeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println("to request the reimburse with employee....");
    }
}
