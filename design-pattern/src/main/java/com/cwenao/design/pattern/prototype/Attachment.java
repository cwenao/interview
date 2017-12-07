/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.prototype;

import java.io.Serializable;

/**
 * @author cwenao
 * @version $Id Attachment.java, v 0.1 2017-12-07 08:57 cwenao Exp $$
 */
public class Attachment implements Serializable {
    private String name;

    public void download() {
        System.out.println("this is the accachment " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
