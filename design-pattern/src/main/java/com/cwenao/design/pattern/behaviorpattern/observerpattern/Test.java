/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.observerpattern;

/**
 * @author cwenao
 * @version $Id Test.java, v 0.1 2017-12-16 11:02 cwenao Exp $$
 */
public class Test {
    public static void main(String[] args) {
        AllyController allyController = new ConcreteAllyController("金庸");
        Observer yangguo, linghuchong, zhangwuji, duanyu;

        yangguo = new Player("杨过");
        allyController.join(yangguo);

        linghuchong = new Player("令狐冲");
        allyController.join(linghuchong);

        zhangwuji = new Player("张无忌");
        allyController.join(zhangwuji);

        duanyu = new Player("段誉");
        allyController.join(duanyu);

        yangguo.beAttacked(allyController);
    }
}
