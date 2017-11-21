/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.multi.thread.learn.baseTest;

/**
 * @author cwenao
 * @version $Id TestThreadSafe4.java, v 0.1 2017-11-15 17:47 cwenao Exp $$
 */
public class TestThreadSafe4 extends Thread {

    private TestThreadSafeSynchronized testThreadSafeSynchronized;
    public TestThreadSafe4(TestThreadSafeSynchronized testThreadSafeSynchronized) {
        this.testThreadSafeSynchronized = testThreadSafeSynchronized;
    }
    @Override
    public void run() {
        testThreadSafeSynchronized.testSyncBlockWithOther();
    }
}
