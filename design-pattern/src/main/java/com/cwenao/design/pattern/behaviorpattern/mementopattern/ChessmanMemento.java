/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.mementopattern;

/**
 * @author cwenao
 * @version $Id ChessmanMemento.java, v 0.1 2017-12-16 09:35 cwenao Exp $$
 */
public class ChessmanMemento {
    private String label;
    private int x;
    private int y;

    public ChessmanMemento(String label, int x, int y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
