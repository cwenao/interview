/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.multi.thread.learn;

/**
 * @author cwenao
 * @version $Id TestThreadSafeDeadLock2.java, v 0.1 2017-11-16 10:47 cwenao Exp $$
 */
public class TestThreadSafeDeadLock2 extends Thread {

    private TestDeadLock testDeadLock;

    public TestThreadSafeDeadLock2(TestDeadLock testDeadLock) {
        this.testDeadLock = testDeadLock;
    }

    @Override
    public void run() {
        testDeadLock.testDeading();
    }

}
