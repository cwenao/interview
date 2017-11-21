/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.multi.thread.learn.communication;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cwenao
 * @version $Id StackTest.java, v 0.1 2017-11-21 16:02 cwenao Exp $$
 */
public class StackTest {
    private List<Object> list = new ArrayList<>();

    public synchronized void push(Object object) {
        try {
            while (list.size() == 1) {
                this.wait();
            }
            list.add(object);
            System.out.println(" to notify the consumer");
            this.notify();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized Object pop() {
        Object object = null;
        try {
            while (list.size() == 0) {
                this.wait();
            }
            object = list.get(0);
            list.remove(0);
            this.notify();
            System.out.println("to pop the list.get(0)");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object;
    }

}
