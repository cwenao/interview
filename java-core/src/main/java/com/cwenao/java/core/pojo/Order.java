/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.java.core.pojo;

import java.util.List;

/**
 * @author cwenao
 * @version $Id Order.java, v 0.1 2017-11-24 15:45 cwenao Exp $$
 */
public class Order {
    private String id;
    private List<Item> itemList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}
