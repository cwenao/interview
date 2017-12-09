/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.createpattern.buildpattern;

/**
 * @author cwenao
 * @version $Id Test.java, v 0.1 2017-12-09 08:39 cwenao Exp $$
 */
public class Test {
    public static void main(String[] args) {
        AbstractBuilder abstractBuilder = new HexoBuilder();
        ActorController actorController = new ActorController();
        Actor actor = actorController.construct(abstractBuilder);
        System.out.println(actor.getType());
    }
}
