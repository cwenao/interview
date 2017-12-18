/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.strategypattern;

import java.math.BigDecimal;

/**
 * @author cwenao
 * @version $Id Test.java, v 0.1 2017-12-18 23:52 cwenao Exp $$
 */
public class Test {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket();
        Discount studentDiscount = new StudentDiscount();
        movieTicket.setDiscount(studentDiscount);
        movieTicket.setPrice(new BigDecimal(100));

        System.out.println(movieTicket.getPrice().toString());

    }
}
