/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.strategypattern;

import java.math.BigDecimal;

/**
 * @author cwenao
 * @version $Id StudentDiscount.java, v 0.1 2017-12-18 23:51 cwenao Exp $$
 */
public class StudentDiscount implements Discount{
    @Override
    public BigDecimal calculate(BigDecimal price) {
        return price.multiply(new BigDecimal("0.8"));
    }
}
