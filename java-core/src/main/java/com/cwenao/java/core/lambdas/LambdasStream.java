/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.java.core.lambdas;

import com.cwenao.java.core.pojo.Item;
import com.cwenao.java.core.pojo.Order;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * @author cwenao
 * @version $Id LambdasStream.java, v 0.1 2017-11-22 16:36 cwenao Exp $$
 */
public class LambdasStream {

    public static void listStream(List<String> list) {
        //list.stream().filter(s -> s.equals( "RED")).count();
        System.out.println(list.stream().filter(s -> s.equals("RED")).count());
    }

    public static void listStreamToArrays(List<String> list) {
        String[] arr = list.stream().filter(x -> !x.endsWith("RED")).toArray(String[]::new);
        System.out.println(Arrays.toString(arr));
    }

    public static void createStream() {
        Stream<String> stringStream = Stream.generate(() -> "test").limit(10);
        String[] arry = stringStream.toArray(String[]::new);
        System.out.println(Arrays.toString(arry));
    }

    public static void createStreamUsedIterator() {
        Stream<BigInteger> bigIntegerStream = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE)).limit(10);
        BigInteger[] bigIntegers = bigIntegerStream.toArray(BigInteger[]::new);
        System.out.println(Arrays.toString(bigIntegers));
    }

    public static void createStreamUsedPopularAPIs(String source, String pattern) {
        Stream<String> words = Pattern.compile(pattern).splitAsStream(source);
        String[] arrays = words.toArray(String[]::new);
        System.out.println(Arrays.toString(arrays));
    }

    public static void lambdasMap(List<String> stringList) {
        Stream<Integer> stream = stringList.stream().map(s -> s.length());
        Integer[] len = stream.toArray(Integer[]::new);
        System.out.println(Arrays.toString(len));

    }

    public static void lambdasFlatMap(List<Order> lists) {
        Stream<Item> itemStream = lists.stream().flatMap(order -> order.getItemList().stream());
        Item[] items = itemStream.toArray(Item[]::new);
        System.out.println(Arrays.toString(items));
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

        //flatMap
        Item item1 = new Item();
        item1.setItem("nini");
        item1.setItemNmae("ilove");

        Item item2 = new Item();
        item2.setItem("cwenao");
        item2.setItemNmae("yourlove");

        List<Item> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);

        Order order = new Order();
        order.setId("mm");
        order.setItemList(itemList);

        List<Order> orderList = new ArrayList<>();
        orderList.add(order);


//        listStream(list);

//        listStreamToArrays(list);

        createStream();
        createStreamUsedIterator();

        String source = "hello world!123";
        String pattern = "\\W";
        createStreamUsedPopularAPIs(source, pattern);
        lambdasMap(list);
        lambdasFlatMap(orderList);
    }

}
