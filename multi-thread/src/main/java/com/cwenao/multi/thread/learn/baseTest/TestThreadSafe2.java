/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.multi.thread.learn.baseTest;

/**
 * @author cwenao
 * @version $Id TestThreadSafe2.java, v 0.1 2017-11-09 17:10 cwenao Exp $$
 */
public class TestThreadSafe2 extends Thread {

    private MyThreadSafeData myThreadSafeData;

    public TestThreadSafe2(MyThreadSafeData myThreadSafeData) {
        super();
        this.myThreadSafeData = myThreadSafeData;
    }

    @Override
    public void run() {
        myThreadSafeData.testSafeParam("cwenao");
    }

}
