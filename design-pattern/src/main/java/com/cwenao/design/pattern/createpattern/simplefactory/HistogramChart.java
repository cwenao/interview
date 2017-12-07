/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.createpattern.simplefactory;

/**
 * @author cwenao
 * @version $Id HistogramChart.java, v 0.1 2017-11-30 15:17 cwenao Exp $$
 */
public class HistogramChart implements Chart{

    public HistogramChart() {
        System.out.println("this is to create the histogram chart");
    }
    @Override
    public void display() {
        System.out.println("to show the histogram");
    }
}
