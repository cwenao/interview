/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.multi.thread.learn.baseTest;

/**
 * @author cwenao
 * @version $Id TestThreadSafeSynchronized.java, v 0.1 2017-11-15 17:09 cwenao Exp $$
 */
public class TestThreadSafeSynchronized {

    private int num = 0;

    public void testSyncBlockWithThis() {
        synchronized (this) {
            System.out.println("The thread name: " + Thread.currentThread().getName());
        }
        synchronized (this) {
            System.out.println("The thread name 2 ===> : " + Thread.currentThread().getName());
        }
    }

    public void testSyncBlockWithOther() {
        String test = new String("abc");
        synchronized (test) {
            System.out.println("this is the testSyncBlockWithOther thread name: " + Thread.currentThread().getName());
        }
        synchronized (test) {
            System.out.println("this is the testSyncBlockWithOther thread name2 ======> : " + Thread.currentThread().getName());
        }
    }


}
