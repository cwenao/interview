/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.structuredpattern.proxypattern;

/**
 * @author cwenao
 * @version $Id UserValidator.java, v 0.1 2017-12-13 06:20 cwenao Exp $$
 */
public class UserValidator {
    public boolean validator(String id) {
        System.out.println("to validator id: "+ id);
        return true;
    }
}
