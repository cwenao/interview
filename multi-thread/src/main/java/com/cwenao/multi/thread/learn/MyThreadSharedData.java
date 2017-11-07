/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.multi.thread.learn;

/**
 * @author cwenao
 * @version $Id MyThreadSharedData.java, v 0.1 2017-11-07 10:53 cwenao Exp $$
 */
public class MyThreadSharedData extends Thread {

    private int count = 10;

    public void run() {
        super.run();
        while (count > 0) {
            count--;
            System.out.println("The thread running: " + this.currentThread().getName() + " =========> " + count);
        }
    }

    public static void main(String[] args) {
        MyThreadSharedData t = new MyThreadSharedData();

        Thread t2 = new Thread(t, "CWENAO");
        Thread t3 = new Thread(t, "NINI");

        t2.start();
        t3.start();

    }
}
