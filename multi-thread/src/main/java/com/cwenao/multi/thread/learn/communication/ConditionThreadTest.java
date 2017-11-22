/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.multi.thread.learn.communication;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author cwenao
 * @version $Id ConditionThreadTest.java, v 0.1 2017-11-22 09:42 cwenao Exp $$
 */
public class ConditionThreadTest {

    public class ServiceCondition {
        private Lock lock = new ReentrantLock();
        public Condition conditionA = lock.newCondition();
        public Condition conditionB = lock.newCondition();

        public void awaitA() {
            try {
                lock.lock();
                System.out.println("this is to test the conditionA : " + Thread.currentThread().getName() + " time: " + System.currentTimeMillis());
                Thread.sleep(1000);
                conditionA.await();
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                System.out.println("conditionA await time... " + System.currentTimeMillis());
                lock.unlock();
            }
        }

        public void awaitB() {
            try {
                lock.lock();
                System.out.println("this is to test the conditionB : " + Thread.currentThread().getName() + " time: " + System.currentTimeMillis());
                Thread.sleep(1000);
                conditionB.await();
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                System.out.println("conditionB await time... " + Thread.currentThread().getName() + " time: " + System.currentTimeMillis());
                lock.unlock();
            }
        }

        public void signalA() {
            try {
                lock.lock();
                System.out.println("this is to ending the conditionA : " + Thread.currentThread().getName() + " time: " + System.currentTimeMillis());
                conditionA.signalAll();
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                System.out.println(" ========+> conditionA");
                lock.unlock();
            }
        }

        public void signalB() {
            try {
                lock.lock();
                System.out.println("this is to ending the conditionB : " + Thread.currentThread().getName() + " time: " + System.currentTimeMillis());
                conditionB.signalAll();
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                System.out.println("============+> conditionB");
                lock.unlock();
            }
        }

    }

    public class ThreadA extends Thread {
        private ServiceCondition serviceCondition;

        public ThreadA(ServiceCondition serviceCondition) {
            this.serviceCondition = serviceCondition;
        }

        @Override
        public void run() {
            serviceCondition.awaitA();
        }
    }

    public class ThreadB extends Thread {
        private ServiceCondition serviceCondition;

        public ThreadB(ServiceCondition serviceCondition) {
            this.serviceCondition = serviceCondition;
        }

        @Override
        public void run() {
            serviceCondition.awaitB();
        }
    }


    public static void main(String[] args) {
        ConditionThreadTest conditionThreadTest = new ConditionThreadTest();

        ServiceCondition serviceCondition = conditionThreadTest.new ServiceCondition();

        ThreadA threadA = conditionThreadTest.new ThreadA(serviceCondition);
        ThreadB threadB = conditionThreadTest.new ThreadB(serviceCondition);

        threadA.start();
        threadB.start();
        serviceCondition.signalA();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        serviceCondition.signalB();

    }


}
