/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.structuredpattern.compositepattern;

/**
 * @author cwenao
 * @version $Id AbstractFile.java, v 0.1 2017-12-09 15:25 cwenao Exp $$
 */
public abstract class AbstractFile {
    abstract void remove(AbstractFile abstractFile);

    abstract void add(AbstractFile abstractFile);

    abstract AbstractFile getChild(int i);

    abstract void operation();
}
