/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.structuredpattern.proxypattern;

/**
 * @author cwenao
 * @version $Id Test.java, v 0.1 2017-12-13 06:24 cwenao Exp $$
 */
public class Test {
    public static void main(String[] args) {
        Searcher searcher = new ProxySearch();
        System.out.println(searcher.searcher("nini"));
    }
}
