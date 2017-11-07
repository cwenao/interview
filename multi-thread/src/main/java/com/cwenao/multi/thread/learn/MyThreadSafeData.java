/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.multi.thread.learn;

/**
 * @author cwenao
 * @version $Id MyThreadSafeData.java, v 0.1 2017-11-07 14:02 cwenao Exp $$
 */
public class MyThreadSafeData {

    private int sum = 0;

    public void testSafeParam(String testStr) {
        try{
            int count = 0;

            if ("cwenao".equals(testStr)) {
                sum += 100;
                count += 1000;
                System.out.println("the count is " + count);
                Thread.sleep(1000);

            } else {
                count +=9;
                sum += 55;
                Thread.sleep(1000);
                System.out.println("this is the count and sum " + count + "   " + sum);
            }

            System.out.println("testStr and count : " + testStr + "  " + count + "   " + sum);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void testSafe(String testStr) {
        int count = 0;
        try {
            if ("cwenao".equals(testStr)) {
                count += 100;
                sum += 100;
                System.out.println("this is the test: " + count + "    " + sum);
            } else {
                count += 9;
                sum += 9;
                System.out.println("this is the test: " + count + "    " + sum);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
