/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.createpattern.prototype;

import java.io.IOException;

/**
 * @author cwenao
 * @version $Id Test.java, v 0.1 2017-12-07 09:05 cwenao Exp $$
 */
public class Test {
    public static void main(String[] args) {
        WeeklyReport weeklyReport, weeklyReportClone = null;
        weeklyReport = new WeeklyReport();
        Attachment attachment = new Attachment();

        weeklyReport.setAttachment(attachment);

        try {
            weeklyReportClone = weeklyReport.deepClone();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("this is the same report: " + (weeklyReport == weeklyReportClone));
        System.out.println("this is the same attachment: " + (weeklyReport.getAttachment() == weeklyReportClone.getAttachment()));

    }
}
