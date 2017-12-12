/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.structuredpattern.flyweightpattern;

import java.util.HashMap;

/**
 * @author cwenao
 * @version $Id IgoChessmanFactory.java, v 0.1 2017-12-12 22:43 cwenao Exp $$
 */
public class IgoChessmanFactory {

    private static HashMap hashMap;

    private IgoChessmanFactory() {
        hashMap = new HashMap();
        IgoChessman black, white;
        black = new BlackChessman();
        white = new WhiteChessman();
        hashMap.put("b", black);
        hashMap.put("w", white);
    }
    private static class InitIgo {
        private final static IgoChessmanFactory igoChessmanFactory=  new IgoChessmanFactory();
    }

    public static IgoChessmanFactory getInstance() {
        return InitIgo.igoChessmanFactory;
    }

    public IgoChessman getIgoChessmanWithColor(String color) {
        return (IgoChessman) hashMap.get(color);
    }

}
