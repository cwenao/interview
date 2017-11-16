/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.multi.thread.learn;

/**
 * @author cwenao
 * @version $Id TestDeadLock.java, v 0.1 2017-11-16 10:33 cwenao Exp $$
 */
public class TestDeadLock {
    public synchronized void testDeading() {
        boolean test = true;
        while (test) {
            System.out.println("start the thread........ " + Thread.currentThread().getName());
        }
        test = false;
        System.out.println("ended the thread: "+ Thread.currentThread().getName());
    }

    public synchronized void testDeadLockWithSync() {
        System.out.println("this is the sync to test dead lock");

    }
}
