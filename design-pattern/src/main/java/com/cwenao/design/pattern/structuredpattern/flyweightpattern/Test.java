/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.structuredpattern.flyweightpattern;

/**
 * @author cwenao
 * @version $Id Test.java, v 0.1 2017-12-12 22:53 cwenao Exp $$
 */
public class Test {
    public static void main(String[] args) {
        IgoChessmanFactory igoChessmanFactory = IgoChessmanFactory.getInstance();
        IgoChessman blackChessman = igoChessmanFactory.getIgoChessmanWithColor("b");
        System.out.println(blackChessman.getColor());
        IgoChessman whiteChessman = igoChessmanFactory.getIgoChessmanWithColor("w");
        System.out.println(whiteChessman.getColor());
    }
}
