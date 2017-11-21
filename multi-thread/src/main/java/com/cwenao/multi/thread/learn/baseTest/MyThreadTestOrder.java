/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.multi.thread.learn.baseTest;

/**
 * 多线程与调用顺序无关
 * @author cwenao
 * @version $Id MyThreadTestOrder.java, v 0.1 2017-11-06 11:24 cwenao Exp $$
 */
public class MyThreadTestOrder extends Thread {

    @Override
    public void run() {
        try{
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("THE RUNNING THREAD =========> " + i + "      " + Thread.currentThread().getName());

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyThreadTestOrder myThreadTestOrder = new MyThreadTestOrder();
        myThreadTestOrder.setName("TEST THREAD ORDER");
        myThreadTestOrder.start();
        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("MAIN RUNNING =========> " + i + "      " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The END ........");
    }
}
