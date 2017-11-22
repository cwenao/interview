/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.java.core.lambdas;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author cwenao
 * @version $Id LambdasSort.java, v 0.1 2017-11-22 15:53 cwenao Exp $$
 */
public class LambdasSort {

    public static void arraySortWithString(String[] arrays) {
        Arrays.sort(arrays, (m, n) -> Integer.compare(m.length(), n.length()));
        System.out.println(Arrays.toString(arrays));
    }

    public static void arraySortWithMultiple(String[] arrays) {
        Arrays.sort(arrays, (m,n) ->{
            if (m.length() > n.length()) {
                return -1;
            } else {
                return 0;
            }
        });
        System.out.println(Arrays.toString(arrays));
    }

    public static void iteratorArrays(String[] arrays) {
        Stream<String> stringStream = Stream.of(arrays);
        stringStream.forEach(x -> System.out.println(x));
    }

    public static void methodReferences(String[] arrays) {
        Stream<String> stringStream = Stream.of(arrays);
        stringStream.sorted((m,n) -> Integer.compare(m.length(),n.length())).forEach(System.out::println);
    }

    public static void noParameter(String[] arrays) {
        Arrays.stream(arrays).forEach((x)->{
            System.out.println(x);
        });
    }


    public static void main(String[] args) {
        String[] arr = {"program", "creek", "is", "a", "java", "site"};
//        arraySortWithString(arr);
//        arraySortWithMultiple(arr);
//        iteratorArrays(arr);
//        methodReferences(arr);
        noParameter(arr);
    }


}


