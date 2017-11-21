/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.multi.thread.learn.communication;

/**
 * @author cwenao
 * @version $Id ProducerAndConsumerTest.java, v 0.1 2017-11-21 16:01 cwenao Exp $$
 */
public class ProducerAndConsumerTest {

    public class ProducerTest {
        private StackTest stackTest;

        public ProducerTest(StackTest stackTest) {
            this.stackTest = stackTest;
        }

        public void push(Object object) {
            stackTest.push(object);
        }
    }

    public class ConsumerTest {
        private StackTest stackTest;

        public ConsumerTest(StackTest stackTest) {
            this.stackTest = stackTest;
        }

        public void pop() {
            stackTest.pop();
        }
    }

    public class PThread extends Thread {
        private ProducerTest producerTest;

        public PThread(ProducerTest producerTest) {
            this.producerTest = producerTest;
        }

        @Override
        public void run() {
            int i = 0;
            while (true) {
                producerTest.push("Thread: " + (i + 1));
            }
        }

    }

    public class CThread extends Thread {
        private ConsumerTest consumerTest;

        public CThread(ConsumerTest consumerTest) {
            this.consumerTest = consumerTest;
        }

        @Override
        public void run() {
            while (true) {
                consumerTest.pop();
            }
        }
    }

    public static void main(String[] args) {
        StackTest stackTest = new StackTest();

        ProducerAndConsumerTest pac = new ProducerAndConsumerTest();

        ProducerTest producerTest = pac.new ProducerTest(stackTest);
        ConsumerTest consumerTest = pac.new ConsumerTest(stackTest);

        PThread pThread = pac.new PThread(producerTest);
        CThread cThread = pac.new CThread(consumerTest);

        pThread.start();
        cThread.start();
    }

}
