/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.interpreterpattern;

/**
 * @author cwenao
 * @version $Id ActionNode.java, v 0.1 2017-12-14 10:24 cwenao Exp $$
 */
public class ActionNode extends AbstractNode{

    private String action;

    public ActionNode(String action) {
        this.action = action;
    }

    @Override
    public String interpret() {

        if ("RUN".equalsIgnoreCase(action)) {
            return "RUNNING";
        } else if ("MOVE".equalsIgnoreCase(action)) {
            return "MOVE";
        } else {
            return "Invalid cmd";
        }
    }
}
