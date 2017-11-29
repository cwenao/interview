/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.java.core.lambdas;

/**
 * SAM（Single Abstract Method）类型接口
 * 定义SAM类型的接口，使得以其为参数的方法，可以在调用时，使用一个lambda表达式作为参数
 * 从原则上讲，这个接口中，只能有一个函数需要被实现，但是也可以有如下例外:
 * 1. 默认方法与静态方法并不影响函数式接口的契约，可以任意使用，即函数式接口中可以有静态方法，
 *     一个或者多个静态方法不会影响SAM接口成为函数式接口，并且静态方法可以提供方法实现可以由 default 修饰的默认方法方法，
 *     这个关键字是Java8中新增的，为的目的就是使得某一些接口，原则上只有一个方法被实现，但是由于历史原因，
 *     需要兼容整个JDK中的API，所以就需要使用default关键字来定义这样的方法
 * 2. 可以有 Object 中覆盖的方法，也就是 equals，toString，hashcode等方法。
 * @author cwenao
 * @version $Id SAMInterface.java, v 0.1 2017-11-29 15:27 cwenao Exp $$
 */
@FunctionalInterface
public interface SAMInterface {
    String doConcatString(String string, String string2);
}
