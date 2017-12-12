/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.structuredpattern.proxypattern;

/**
 * @author cwenao
 * @version $Id ProxySearch.java, v 0.1 2017-12-13 06:20 cwenao Exp $$
 */
public class ProxySearch implements Searcher{

    private RealSearcher realSearcher = new RealSearcher();
    private UserValidator userValidator;

    @Override
    public String searcher(String id) {

        userValidator(id);
        return realSearcher.searcher(id);
    }

    private boolean userValidator(String id) {
        userValidator = new UserValidator();
        return userValidator.validator(id);
    }
}
