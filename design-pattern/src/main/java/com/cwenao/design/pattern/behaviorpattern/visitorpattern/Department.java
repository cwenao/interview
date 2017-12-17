/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.visitorpattern;

/**
 * @author cwenao
 * @version $Id Department.java, v 0.1 2017-12-17 14:48 cwenao Exp $$
 */
public interface Department {
    void visitor(FullTimeEmploye fullTimeEmploye);

    void visitor(PartTimeEmplloyes partTimeEmplloyes);
}
