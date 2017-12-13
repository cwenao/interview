/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.commandpattern;

/**
 * @author cwenao
 * @version $Id InsertCommand.java, v 0.1 2017-12-14 06:10 cwenao Exp $$
 */
public class InsertCommand extends CommandPattern {

    public InsertCommand(String nodeName) {
        super(nodeName);
    }

    @Override
    public void execute(String cmd) {
        this.cmd = cmd;
        configOperator.insert(cmd);
    }

    @Override
    public void execute() {
        configOperator.insert(this.cmd);
    }
}
