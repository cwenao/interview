/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.multi.thread.learn.communication;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author cwenao
 * @version $Id RenntrantATest.java, v 0.1 2017-11-21 17:50 cwenao Exp $$
 */
public class RenntrantATest {

    public class Service {
        private Lock lock = new ReentrantLock();

        public void testMethod() {
            lock.lock();
            int i = 0;
            while (i < 100) {
                System.out.println("The Thread name: " + Thread.currentThread().getName() + " The Value is: " + i++);
            }
            lock.unlock();
        }
    }

    public class TestThread extends Thread{
        private Service service;

        public TestThread(Service service) {
            this.service = service;
        }

        @Override
        public void run() {
            service.testMethod();
        }
    }

    public static void main(String[] args) {
        RenntrantATest renntrantATest = new RenntrantATest();

        Service service = renntrantATest.new Service();
        TestThread testThread = renntrantATest.new TestThread(service);
        TestThread testThread1 = renntrantATest.new TestThread(service);
        testThread.start();
        testThread1.start();
    }
}
