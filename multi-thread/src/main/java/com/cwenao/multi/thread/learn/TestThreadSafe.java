/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.multi.thread.learn;

/**
 * @author cwenao
 * @version $Id TestThreadSafe.java, v 0.1 2017-11-07 14:26 cwenao Exp $$
 */
public class TestThreadSafe extends Thread {

    private MyThreadSafeData myThreadSafeData;

    public TestThreadSafe(MyThreadSafeData myThreadSafeData) {
        super();
        this.myThreadSafeData = myThreadSafeData;
    }

    @Override
    public void run() {
        super.run();
//        myThreadSafeData.testSafeParam("nini");
        myThreadSafeData.testSafe("nini");
    }

    public static void main(String[] args) {
        //MyThreadSafeData myThreadSafeData = new MyThreadSafeData();
//        TestThreadSafe t1 = new TestThreadSafe(myThreadSafeData);
//        TestThreadSafe t2 = new TestThreadSafe(myThreadSafeData);
//        t1.start();
//        t2.start();
//
//        TestThreadSafe2 t3 = new TestThreadSafe2(myThreadSafeData);
//        TestThreadSafe2 t4 = new TestThreadSafe2(myThreadSafeData);
//
//        t3.start();
//        t4.start();

//        TestThreadSafeSynchronized testThreadSafeSynchronized = new TestThreadSafeSynchronized();
//        TestThreadSafe3 testThreadSafe3 = new TestThreadSafe3(testThreadSafeSynchronized);
//        TestThreadSafe3 testThreadSafe31 = new TestThreadSafe3(testThreadSafeSynchronized);
//
//        testThreadSafe3.start();
//        testThreadSafe31.start();
//
//        TestThreadSafe4 testThreadSafe4 = new TestThreadSafe4(testThreadSafeSynchronized);
//        TestThreadSafe4 testThreadSafe41 = new TestThreadSafe4(testThreadSafeSynchronized);
//
//        testThreadSafe4.start();
//        testThreadSafe41.start();

//        TestDeadLock testDeadLock = new TestDeadLock();
//
//        TestThreadSafeDeadLock1 testThreadSafeDeadLock1 = new TestThreadSafeDeadLock1(testDeadLock);
//        TestThreadSafeDeadLock1 testThreadSafeDeadLock11 = new TestThreadSafeDeadLock1(testDeadLock);
//
//        testThreadSafeDeadLock1.start();
//        testThreadSafeDeadLock11.start();

        TestDeadLock testDeadLock = new TestDeadLock();
        TestThreadSafeDeadLock2 testThreadSafeDeadLock2 = new TestThreadSafeDeadLock2(testDeadLock);
        TestThreadSafeDeadLock1 testThreadSafeDeadLock1 = new TestThreadSafeDeadLock1(testDeadLock);

        testThreadSafeDeadLock1.start();
        testThreadSafeDeadLock2.start();

    }

}
