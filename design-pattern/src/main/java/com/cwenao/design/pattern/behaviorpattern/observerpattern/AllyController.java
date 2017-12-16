/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cwenao
 * @version $Id AllyController.java, v 0.1 2017-12-16 10:49 cwenao Exp $$
 */
public abstract class AllyController {
    protected String allyName;
    protected List<Observer> players = new ArrayList<>();

    public void join(Observer observer) {
        System.out.println(observer.getName() + " 加入 " + this.allyName + "战队");
        players.add(observer);
    }

    public void quit(Observer observer) {
        System.out.println(observer.getName() + " 退出 " + this.allyName + "战队");
        players.remove(observer);
    }

    public abstract void notifyObserver(String name);

    public String getAllyName() {
        return allyName;
    }

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }
}
