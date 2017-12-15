/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.mediatorpattern;

/**
 * @author cwenao
 * @version $Id Component.java, v 0.1 2017-12-15 09:08 cwenao Exp $$
 */
public abstract class Component {
    protected AbstractMediator mediator;

    public void setMediator(AbstractMediator mediator) {
        this.mediator = mediator;
    }

    public void changed() {
        mediator.componentChanged(this);
    }

    public abstract void update();
}
