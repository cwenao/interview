/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.strategypattern;

import java.math.BigDecimal;

/**
 * @author cwenao
 * @version $Id MovieTicket.java, v 0.1 2017-12-18 23:09 cwenao Exp $$
 */
public class MovieTicket {
    private BigDecimal price;
    private Discount discount;

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return discount.calculate(this.price);
    }
}
