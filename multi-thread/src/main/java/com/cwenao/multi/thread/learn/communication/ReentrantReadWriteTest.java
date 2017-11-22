/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.multi.thread.learn.communication;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author cwenao
 * @version $Id ReentrantReadWriteTest.java, v 0.1 2017-11-22 10:36 cwenao Exp $$
 */
public class ReentrantReadWriteTest {

    public class ServiceReadWriteLock {

        private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

        public void read() {
            try {
                lock.readLock().lock();
                System.out.println("this is the read lock() : " + Thread.currentThread().getName() + " time: " + System.currentTimeMillis());
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                lock.readLock().unlock();
            }
        }

        public void write() {
            try {
                lock.writeLock().lock();
                System.out.println("this is the write lock() : " + Thread.currentThread().getName() + " time: " + System.currentTimeMillis());
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                lock.writeLock().unlock();
            }
        }
    }

    public class ThreadA extends Thread {
        private ServiceReadWriteLock serviceReadWriteLock;

        public ThreadA(ServiceReadWriteLock serviceReadWriteLock) {
            this.serviceReadWriteLock = serviceReadWriteLock;
        }

        @Override
        public void run() {
            serviceReadWriteLock.read();
        }
    }

    public class ThreadB extends Thread {
        private ServiceReadWriteLock serviceReadWriteLock;

        public ThreadB(ServiceReadWriteLock serviceReadWriteLock) {
            this.serviceReadWriteLock = serviceReadWriteLock;
        }

        @Override
        public void run() {
            serviceReadWriteLock.write();
        }
    }

    public static void main(String[] args) {

        ReentrantReadWriteTest reentrantReadWriteTest = new ReentrantReadWriteTest();
        ServiceReadWriteLock serviceReadWriteLock = reentrantReadWriteTest.new ServiceReadWriteLock();

        ThreadA threadA = reentrantReadWriteTest.new ThreadA(serviceReadWriteLock);
        ThreadA threadA1 = reentrantReadWriteTest.new ThreadA(serviceReadWriteLock);
        ThreadB threadB = reentrantReadWriteTest.new ThreadB(serviceReadWriteLock);
        ThreadB threadB1 = reentrantReadWriteTest.new ThreadB(serviceReadWriteLock);

        threadA.start();
        threadA1.start();

        threadB.start();
        threadB1.start();
    }
}
