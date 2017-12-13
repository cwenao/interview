/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.commandpattern;

/**
 * @author cwenao
 * @version $Id Test.java, v 0.1 2017-12-14 06:28 cwenao Exp $$
 */
public class Test {
    public static void main(String[] args) {
        ConfigSettingRequestor configSettingRequestor = new ConfigSettingRequestor();
        CommandPattern commandPattern;
        ConfigOperator configOperator = new ConfigOperator();

        commandPattern = new InsertCommand("add");
        commandPattern.setConfigOperator(configOperator);
        configSettingRequestor.setCommandPattern(commandPattern);
        configSettingRequestor.call("add the index");
    }
}
