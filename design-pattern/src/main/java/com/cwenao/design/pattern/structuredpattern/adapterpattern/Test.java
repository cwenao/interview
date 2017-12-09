/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.structuredpattern.adapterpattern;

/**
 * @author cwenao
 * @version $Id Test.java, v 0.1 2017-12-09 09:03 cwenao Exp $$
 */
public class Test {
    public static void main(String[] args) {
        ScoreOperation scoreOperation = new OperationAdapter();
        scoreOperation.sort();
    }
}
