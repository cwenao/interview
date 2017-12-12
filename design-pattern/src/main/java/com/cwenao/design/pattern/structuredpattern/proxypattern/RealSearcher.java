/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.structuredpattern.proxypattern;

/**
 * @author cwenao
 * @version $Id RealSearcher.java, v 0.1 2017-12-13 06:19 cwenao Exp $$
 */
public class RealSearcher implements Searcher{

    @Override
    public String searcher(String id) {
        return "cwenao";
    }
}
