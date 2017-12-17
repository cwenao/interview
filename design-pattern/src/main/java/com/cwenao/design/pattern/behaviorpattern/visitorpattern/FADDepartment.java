/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.visitorpattern;

/**
 * @author cwenao
 * @version $Id FADDepartment.java, v 0.1 2017-12-17 15:02 cwenao Exp $$
 */
public class FADDepartment implements Department {
    @Override
    public void visitor(FullTimeEmploye fullTimeEmploye) {
        System.out.println("to calculate the full time Employes wage....| userName: "+fullTimeEmploye.getUserName()+ " wage:"+fullTimeEmploye.getWage()
        + " workTime: "+fullTimeEmploye.getWorkTime());

    }

    @Override
    public void visitor(PartTimeEmplloyes partTimeEmplloyes) {
        System.out.println("to calculate the part time Employes wage....");
    }
}
