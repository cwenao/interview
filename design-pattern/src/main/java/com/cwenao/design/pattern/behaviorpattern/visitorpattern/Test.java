/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.visitorpattern;

import java.math.BigDecimal;

/**
 * @author cwenao
 * @version $Id Test.java, v 0.1 2017-12-17 15:06 cwenao Exp $$
 */
public class Test {
    public static void main(String[] args) {
        FullTimeEmploye full1 = new FullTimeEmploye();
        full1.setUserName("cwenao");
        full1.setWage(new BigDecimal(100));
        full1.setWorkTime(40);

        Department fad = new FADDepartment();
        fad.visitor(full1);

    }
}
