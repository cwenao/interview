/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.structuredpattern.facadepattern;

/**
 * @author cwenao
 * @version $Id FacadeSimpleImpl.java, v 0.1 2017-12-11 06:20 cwenao Exp $$
 */
public class FacadeSimpleImpl implements FacadeSimple{
    @Override
    public void fileReader() {
        FileReader fileReader = new FileReader();
        fileReader.setName("aaaaaaa");
        System.out.println(fileReader.getName());
    }

    @Override
    public void fileWrite() {

    }
}
