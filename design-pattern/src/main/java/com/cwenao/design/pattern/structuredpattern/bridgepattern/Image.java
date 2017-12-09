/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.structuredpattern.bridgepattern;

/**
 * @author cwenao
 * @version $Id Image.java, v 0.1 2017-12-09 14:45 cwenao Exp $$
 */
public abstract class Image {
    protected ImageImpl imageImple;

    public void setImageImple(ImageImpl imageImple) {
        this.imageImple = imageImple;
    }

    public abstract void parseFile(String fileName);
}
