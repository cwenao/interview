/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.strategypattern;

import java.math.BigDecimal;

/**
 * @author cwenao
 * @version $Id Discount.java, v 0.1 2017-12-18 23:48 cwenao Exp $$
 */
public interface Discount {
    BigDecimal calculate(BigDecimal price);
}
