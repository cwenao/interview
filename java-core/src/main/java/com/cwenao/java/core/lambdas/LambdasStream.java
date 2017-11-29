/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.java.core.lambdas;

import com.cwenao.java.core.pojo.Item;
import com.cwenao.java.core.pojo.Order;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
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

    public static void lambdasFlatMap2() {
        Path path = null;

        try {
             path = Paths.get("/Users/cwenao/myblog");
             //@SuppressWarnings("FilesLinesLeak") to solve the warnings
            @SuppressWarnings("FilesLinesLeak") Stream<String> lines =Files.lines(path, StandardCharsets.UTF_8);
            /**
             * or use the try{}catch(){}
             * try (Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8)){
             *     Stream<String> works = lines.flatMap(line -> Stream.of(line.split("\\W+")));
             *     String[] worksArray = works.toArray(String[]::new);
             *     System.out.println(Arrays.toString(worksArray));
             * }
             **/
            Stream<String> works = lines.flatMap(line -> Stream.of(line.split("\\W+")));
            String[] worksArray = works.toArray(String[]::new);
            System.out.println(Arrays.toString(worksArray));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void simpleReduce(List<String> strings) {
        Optional<String> optional = strings.stream().reduce((x, y) -> x + " test: " + y);
        optional.ifPresent(System.out::println);
    }

    public static void simpleCollectors() {
        Stream<String> stringStream = Stream.of("a", "b", "c");
        List<String> stringList = stringStream.collect(Collectors.toList());
        System.out.println(Arrays.toString(stringList.toArray()));
    }

    public static void optional() {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(4);
        integerList.add(10);

        int sum = integerList.stream().reduce( (x, y) -> x + y).orElse(0);
        System.out.println("this is the optional: " + sum);
    }

    public static void counter() {
        String[] arrays = {"a", "b", "a", "b", "c", "nini", "cwenao", "b"};
        Stream<String> stringStream = Stream.of(arrays).parallel();
        Map<String, Long> counter = stringStream.collect(Collectors.groupingBy(String::toString, Collectors.counting()));
        System.out.println(counter.get("b"));
    }

    /**
     * this is the parallel execution
     */
    public static void parallelStream() {
        List<String> stringList = Arrays.asList("I", "LOVE", "YOU", "NINI", "\\n", "-- cwenao");
        stringList.parallelStream().forEach(x -> System.out.println(x + " "));
    }

    public static void concatStream() {
        Stream<String> stringStream1 = Stream.of("a", "b", "c", "d");
        Stream<String> stringStream2 = Stream.of("nini", "cwenao");

        stringStream2 = Stream.concat(stringStream1, stringStream2);
        System.out.println(Arrays.toString(stringStream2.toArray(String[]::new)));
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
        //lambdasFlatMap2();
        simpleReduce(list);
        simpleCollectors();
        optional();

        counter();
        parallelStream();
        concatStream();

    }
}
