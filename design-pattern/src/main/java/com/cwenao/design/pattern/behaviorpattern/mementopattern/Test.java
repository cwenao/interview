/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.mementopattern;

/**
 * @author cwenao
 * @version $Id Test.java, v 0.1 2017-12-16 09:39 cwenao Exp $$
 */
public class Test {
    public static void main(String[] args) {
        MementoCaretaker mementoCaretaker = new MementoCaretaker();
        Chessman chessman = new Chessman("炮", 3, 3);
        display(chessman);
        mementoCaretaker.setChessmanMemento(chessman.save());

        chessman.setX(4);
        chessman.setY(5);
        mementoCaretaker.setChessmanMemento(chessman.save());
        display(chessman);

        chessman.setX(5);
        chessman.setY(7);
        display(chessman);

        chessman.restore(mementoCaretaker.getChessmanMemento());
        display(chessman);

    }

    private static void display(Chessman chessman) {
        System.out.println("Chessman: " + chessman.getLabel() + " Chessman location: x - " + chessman.getX() + " y - " + chessman.getY());
    }
}
