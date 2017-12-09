/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.createpattern.buildpattern;

/**
 * @author cwenao
 * @version $Id ActorController.java, v 0.1 2017-12-09 08:37 cwenao Exp $$
 */
public class ActorController {
    public Actor construct(AbstractBuilder abstractBuilder) {
        Actor actor;
        abstractBuilder.buileType();
        abstractBuilder.buildSex();
        actor = abstractBuilder.createActor();
        return actor;
    }
}
