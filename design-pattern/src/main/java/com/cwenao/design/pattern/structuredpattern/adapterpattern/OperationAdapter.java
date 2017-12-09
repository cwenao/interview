/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.structuredpattern.adapterpattern;

/**
 * @author cwenao
 * @version $Id OperationAdapter.java, v 0.1 2017-12-09 09:02 cwenao Exp $$
 */
public class OperationAdapter implements ScoreOperation {
    @Override
    public void sort() {
        QuickSort quickSort = new QuickSort();
        quickSort.sort();
        System.out.println("this the adapter to call adaptee sort method...");
    }
}
