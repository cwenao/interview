/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.multi.thread.learn.baseTest;

/**
 * @author cwenao
 * @version $Id TestDeadLock.java, v 0.1 2017-11-16 10:33 cwenao Exp $$
 */
public class TestDeadLock {

    Object object = new Object();
    Object object1 = new Object();

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

    public void testDeadLockBlock() {
        synchronized (object) {
            int x = 0;
            while (x < 10) {
                try {
                    System.out.println("to test the sync block  ======> " + x++);
                    Thread.sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void testDeadLockBlock2() {
        synchronized (object1) {
            int x = 0;
            while (x < 10) {
                try {
                    System.out.println("to test the sync block2 =======> " + x++);
                    Thread.sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
