/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.commandpattern;

import java.io.Serializable;

/**
 * @author cwenao
 * @version $Id CommandPattern.java, v 0.1 2017-12-14 06:06 cwenao Exp $$
 */
public abstract class CommandPattern implements Serializable {
    protected String nodeName;
    protected String cmd;
    protected ConfigOperator configOperator;

    public CommandPattern(String nodeName) {
        this.nodeName = nodeName;
    }

    public abstract void execute(String cmd);

    public abstract void execute();

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public ConfigOperator getConfigOperator() {
        return configOperator;
    }

    public void setConfigOperator(ConfigOperator configOperator) {
        this.configOperator = configOperator;
    }
}
