/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.multi.thread.learn.baseTest;

/**
 * @author cwenao
 * @version $Id MyThreadNotShareData.java, v 0.1 2017-11-07 10:46 cwenao Exp $$
 */
public class MyThreadNotShareData extends Thread{

    private int count = 10;

    public MyThreadNotShareData(String name) {
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count--;
            System.out.println("The Thread running : " + this.currentThread().getName() + " =======》 " + count);
        }
    }

    public static void main(String[] args) {
        MyThreadNotShareData t1 = new MyThreadNotShareData("CWENAO");
        MyThreadNotShareData t2 = new MyThreadNotShareData("NINI");

        t1.start();
        t2.start();

    }

}
