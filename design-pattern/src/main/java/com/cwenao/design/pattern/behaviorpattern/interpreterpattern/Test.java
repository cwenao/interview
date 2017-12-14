/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.interpreterpattern;

/**
 * @author cwenao
 * @version $Id Test.java, v 0.1 2017-12-14 11:09 cwenao Exp $$
 */
public class Test {
    public static void main(String[] args) {
        String instruction = "up run 1 and down move 5";
        InstructionHandler instructionHandler = new InstructionHandler();
        instructionHandler.handler(instruction);
        System.out.println(instructionHandler.output());

    }
}