/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.structuredpattern.chainofresponsibilitypattern;

/**
 * @author cwenao
 * @version $Id Approver.java, v 0.1 2017-12-13 09:45 cwenao Exp $$
 */
public abstract class Approver {
    protected Approver approver;
    protected String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setSuccessor(Approver approver) {
        this.approver = approver;
    }

    public abstract void processRequest(PurchaseRequest request);

}
