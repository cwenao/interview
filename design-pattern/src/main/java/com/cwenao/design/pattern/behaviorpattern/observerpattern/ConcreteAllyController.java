/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.observerpattern;

/**
 * @author cwenao
 * @version $Id ConcreteAllyController.java, v 0.1 2017-12-16 10:57 cwenao Exp $$
 */
public class ConcreteAllyController extends AllyController{

    public ConcreteAllyController(String allyName) {
        System.out.println(allyName + " 战队组建成功！");
        this.allyName = allyName;
    }

    @Override
    public void notifyObserver(String name) {
        System.out.println(this.allyName + "战队紧急通知，盟友 " + name + " 遭遇敌人攻击！");

        for (Observer observer : players) {
            if (!observer.getName().equalsIgnoreCase(name)) {
                observer.help();
            }
        }
    }

}
