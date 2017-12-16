/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.mementopattern;

/**
 * @author cwenao
 * @version $Id MementoCaretaker.java, v 0.1 2017-12-16 09:38 cwenao Exp $$
 */
public class MementoCaretaker {
    private ChessmanMemento chessmanMemento;

    public ChessmanMemento getChessmanMemento() {
        return chessmanMemento;
    }

    public void setChessmanMemento(ChessmanMemento chessmanMemento) {
        this.chessmanMemento = chessmanMemento;
    }
}
