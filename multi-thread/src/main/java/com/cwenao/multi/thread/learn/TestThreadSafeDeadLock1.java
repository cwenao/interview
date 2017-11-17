/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.multi.thread.learn;

/**
 * @author cwenao
 * @version $Id TestThreadSafeDeadLock1.java, v 0.1 2017-11-16 10:44 cwenao Exp $$
 */
public class TestThreadSafeDeadLock1 extends Thread {

    private TestDeadLock testDeadLock;

    public TestThreadSafeDeadLock1(TestDeadLock testDeadLock) {
        this.testDeadLock = testDeadLock;
    }

    @Override
    public void run() {
        testDeadLock.testDeadLockBlock();
    }
}
