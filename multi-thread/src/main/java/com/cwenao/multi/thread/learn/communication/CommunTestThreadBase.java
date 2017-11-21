/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.multi.thread.learn.communication;

/**
 * @author cwenao
 * @version $Id CommunTestThreadBase.java, v 0.1 2017-11-21 14:18 cwenao Exp $$
 */
public class CommunTestThreadBase {

    public class ThreadTestWait extends Thread{

        Object lock;

        public ThreadTestWait(Object lock) {
            this.lock = lock;
        }

        @Override
        public void run() {
            try {
                synchronized (lock) {
                    System.out.println("To start wait the thread: " + Thread.currentThread().getName() + " Time: " + System.currentTimeMillis());
                    lock.wait();
                    System.out.println("To end wait: " + Thread.currentThread().getName() + " Time: " + System.currentTimeMillis());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class ThreadTestNotify extends Thread{
        Object lock;

        public ThreadTestNotify(Object lock) {
            this.lock = lock;
        }

        @Override
        public void run() {
            try {
                synchronized (lock) {
                    System.out.println("Start notify the Thread： " + Thread.currentThread().getName() + " Time: " + System.currentTimeMillis());
                    lock.notify();
                    System.out.println("end notiry the Thread: " + Thread.currentThread().getName() + " Time: " + System.currentTimeMillis());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        try {
            Object lock = new Object();
            CommunTestThreadBase cu = new CommunTestThreadBase();
            ThreadTestWait threadTestWait = cu.new ThreadTestWait(lock);
            threadTestWait.start();

            ThreadTestNotify threadTestNotify = cu.new ThreadTestNotify(lock);
            threadTestNotify.start();

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
