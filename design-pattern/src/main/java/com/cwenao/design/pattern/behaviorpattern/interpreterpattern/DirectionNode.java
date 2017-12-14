/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.interpreterpattern;

/**
 * @author cwenao
 * @version $Id DirectionNode.java, v 0.1 2017-12-14 10:17 cwenao Exp $$
 */
public class DirectionNode extends AbstractNode{

    private String direction;

    public DirectionNode(String direction) {
        this.direction = direction;
    }

    @Override
    public String interpret() {

        if ("UP".equalsIgnoreCase(direction)) {
            return "Up the way ";
        } else if ("Down".equalsIgnoreCase(direction)){
            return "Down the way ";
        }else {
            return "Invalid cmd";
        }
    }
}
