/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.visitorpattern;

/**
 * @author cwenao
 * @version $Id HRDepartment.java, v 0.1 2017-12-17 15:04 cwenao Exp $$
 */
public class HRDepartment implements Department{
    @Override
    public void visitor(FullTimeEmploye fullTimeEmploye) {
        System.out.println("to accessment of the full time employe manifestion");
    }

    @Override
    public void visitor(PartTimeEmplloyes partTimeEmplloyes) {
        System.out.println("to accessment of the part time employe manifestion");
    }
}
