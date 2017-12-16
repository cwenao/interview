/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.observerpattern;

/**
 * @author cwenao
 * @version $Id Player.java, v 0.1 2017-12-16 10:54 cwenao Exp $$
 */
public class Player implements Observer {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void help() {
        System.out.println("Come on baby, "+this.name +" 来救你了！！");
    }

    @Override
    public void beAttacked(AllyController allyController) {
        System.out.println(this.name+" 被攻击了！！！");
        allyController.notifyObserver(this.name);
    }
}
