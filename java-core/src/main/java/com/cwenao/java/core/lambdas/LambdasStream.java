/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.java.core.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author cwenao
 * @version $Id LambdasStream.java, v 0.1 2017-11-22 16:36 cwenao Exp $$
 */
public class LambdasStream {

    public static void listStream(List<String> list) {
        list.stream().filter(s -> s == "RED").count();
        System.out.println(list.stream().filter(s -> s == "RED").count());
    }

    public static void listStreamToArrays(List<String> list) {
        String[] arr = list.stream().filter(x -> !x.endsWith("RED")).toArray(String[]::new);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("amm");
        list.add("nini");
        list.add("cwenao");
        list.add("RED");

        listStream(list);

        listStreamToArrays(list);

    }

}
