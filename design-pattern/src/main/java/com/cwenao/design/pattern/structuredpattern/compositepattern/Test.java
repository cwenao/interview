/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.structuredpattern.compositepattern;

/**
 * @author cwenao
 * @version $Id Test.java, v 0.1 2017-12-09 15:37 cwenao Exp $$
 */
public class Test {
    public static void main(String[] args) {
        AbstractFile imageFile1 = new ImageFile();
        AbstractFile imageFile2 = new ImageFile();
        AbstractFile folder1 = new Folder();
        folder1.add(imageFile1);
        folder1.add(imageFile2);
        folder1.operation();
    }
}
