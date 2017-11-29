/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.java.core.lambdas;

/**
 * @author cwenao
 * @version $Id SAMTEST.java, v 0.1 2017-11-29 15:26 cwenao Exp $$
 */
public class SAMTEST {
    private static void testSAM(SAMInterface samInterface) {
        System.out.println(samInterface.doConcatString("nini", "cwenao"));
    }

    public static void main(String[] args) {

        SAMInterface samInterface = (a, b) -> "we are best " + a + b;
        System.out.println(samInterface.doConcatString("nini", "cwenao"));

        testSAM((a, b) -> "we are best ======> " + a + b);

    }
}
