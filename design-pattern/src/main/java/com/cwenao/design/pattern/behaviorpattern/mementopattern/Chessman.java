/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.mementopattern;

/**
 * @author cwenao
 * @version $Id Chessman.java, v 0.1 2017-12-16 09:31 cwenao Exp $$
 */
public class Chessman {
    private String label;
    private int x;
    private int y;

    public Chessman(String label, int x, int y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }
    public ChessmanMemento save() {
        return new ChessmanMemento(this.label, this.x, this.y);
    }

    public void restore(ChessmanMemento chessmanMemento) {
        this.label = chessmanMemento.getLabel();
        this.x = chessmanMemento.getX();
        this.y = chessmanMemento.getY();
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
