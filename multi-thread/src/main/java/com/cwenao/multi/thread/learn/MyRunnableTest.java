/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.multi.thread.learn;

/**
 * implement the Runnable interface
 *
 * @author cwenao
 * @version $Id MyRunnableTest.java, v 0.1 2017-11-07 09:31 cwenao Exp $$
 */
public class MyRunnableTest implements Runnable{
    @Override
    public void run() {
        System.out.println("This is my thread with runnable");
    }

    public static void main(String[] args) {
        Runnable runnable = new MyRunnableTest();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("THE END...");
    }

}
