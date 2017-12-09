/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.structuredpattern.compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cwenao
 * @version $Id Folder.java, v 0.1 2017-12-09 15:30 cwenao Exp $$
 */
public class Folder extends AbstractFile{
    private List<AbstractFile> fileList = new ArrayList<>();

    @Override
    void remove(AbstractFile abstractFile) {
        fileList.remove(abstractFile);
    }

    @Override
    void add(AbstractFile abstractFile) {
        fileList.add(abstractFile);
    }

    @Override
    AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    @Override
    void operation() {
        for (AbstractFile abstractFile : fileList) {
            abstractFile.operation();
        }
    }
}
