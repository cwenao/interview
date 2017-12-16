/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.mementopattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cwenao
 * @version $Id MementoCaretaker.java, v 0.1 2017-12-16 09:38 cwenao Exp $$
 */
public class MementoCaretaker {
    private List<ChessmanMemento> chessmanMementos = new ArrayList<>();

    public ChessmanMemento getChessmanMemento(int index) {
        return chessmanMementos.get(index);
    }

    public void setChessmanMemento(ChessmanMemento chessmanMemento) {
        chessmanMementos.add(chessmanMemento);
    }
}
