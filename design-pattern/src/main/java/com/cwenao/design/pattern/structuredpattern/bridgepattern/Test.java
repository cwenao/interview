/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.structuredpattern.bridgepattern;

/**
 * @author cwenao
 * @version $Id Test.java, v 0.1 2017-12-09 14:56 cwenao Exp $$
 */
public class Test {
    public static void main(String[] args) {
        Image image = new JPGImage();
        ImageImpl image1 = new WinImageImpl();
        image.setImageImple(image1);
        image.parseFile("aaaa");
    }
}
