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
        MyThreadSafeData myThreadSafeData = new MyThreadSafeData();
        TestThreadSafe t1 = new TestThreadSafe(myThreadSafeData);
        TestThreadSafe t2 = new TestThreadSafe(myThreadSafeData);

        t1.start();
        t2.start();

    }

}
