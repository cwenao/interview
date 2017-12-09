/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.structuredpattern.bridgepattern;

/**
 * @author cwenao
 * @version $Id JPGImage.java, v 0.1 2017-12-09 14:49 cwenao Exp $$
 */
public class JPGImage extends Image{
    @Override
    public void parseFile(String fileName) {
        Matrix matrix = new Matrix();
        imageImple.display(matrix);
        System.out.println("this is the JPG Image implements : " + fileName);
    }
}
