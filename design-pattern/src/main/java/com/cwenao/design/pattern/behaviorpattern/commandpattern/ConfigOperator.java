/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.commandpattern;

import java.io.Serializable;

/**
 * @author cwenao
 * @version $Id ConfigOperator.java, v 0.1 2017-12-14 06:07 cwenao Exp $$
 */
public class ConfigOperator implements Serializable {
    public void insert(String cmd) {
        System.out.println("add the node :" + cmd);
    }

    public void modify(String cmd) {
        System.out.println("Modify the node: "+cmd);
    }
}
