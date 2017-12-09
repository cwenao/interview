/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.structuredpattern.compositepattern;

/**
 * @author cwenao
 * @version $Id ImageFile.java, v 0.1 2017-12-09 15:27 cwenao Exp $$
 */
public class ImageFile extends AbstractFile {

    @Override
    void remove(AbstractFile abstractFile) {
        System.out.println("this is the image remove");
    }

    @Override
    void add(AbstractFile abstractFile) {
        System.out.println("this is the image add");

    }

    @Override
    AbstractFile getChild(int i) {
        System.out.println("the image have no child");
        return null;
    }

    @Override
    void operation() {
        System.out.println("to killed the image file");

    }
}
