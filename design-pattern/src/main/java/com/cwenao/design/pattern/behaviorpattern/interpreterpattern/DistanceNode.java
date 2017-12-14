/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.interpreterpattern;

/**
 * @author cwenao
 * @version $Id DistanceNode.java, v 0.1 2017-12-14 10:33 cwenao Exp $$
 */
public class DistanceNode extends AbstractNode {

    private String distance;

    public DistanceNode(String distance) {
        this.distance = distance;
    }

    @Override
    public String interpret() {
        if ("1".equalsIgnoreCase(distance)) {
            return "1";
        } else if ("2".equalsIgnoreCase(distance)) {
            return "2";
        } else {
            return "error";
        }
    }
}
