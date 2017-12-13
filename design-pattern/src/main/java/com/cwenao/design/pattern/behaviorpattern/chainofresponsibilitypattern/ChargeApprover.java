/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.chainofresponsibilitypattern;

/**
 * @author cwenao
 * @version $Id ChargeApprover.java, v 0.1 2017-12-13 09:51 cwenao Exp $$
 */
public class ChargeApprover extends Approver{

    public ChargeApprover(String name) {
        super(name);
    }
    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println("to examine and approve with charge.....");
    }
}
