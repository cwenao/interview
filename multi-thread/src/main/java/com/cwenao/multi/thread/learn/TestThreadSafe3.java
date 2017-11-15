/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.multi.thread.learn;

/**
 * @author cwenao
 * @version $Id TestThreadSafe3.java, v 0.1 2017-11-15 17:22 cwenao Exp $$
 */
public class TestThreadSafe3 extends Thread {

    TestThreadSafeSynchronized testThreadSafeSynchronized;

    public TestThreadSafe3(TestThreadSafeSynchronized testThreadSafeSynchronized) {
        this.testThreadSafeSynchronized = testThreadSafeSynchronized;
    }
    @Override
    public void run() {
        testThreadSafeSynchronized.testSyncBlockWithThis();
    }

}
