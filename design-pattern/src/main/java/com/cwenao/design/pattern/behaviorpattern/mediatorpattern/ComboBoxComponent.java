/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.mediatorpattern;

/**
 * @author cwenao
 * @version $Id ComboBoxComponent.java, v 0.1 2017-12-15 09:13 cwenao Exp $$
 */
public class ComboBoxComponent extends Component{
    @Override
    public void update() {
        System.out.println("add the nini to combobox.....");
    }

    public void select() {
        System.out.println("selected the xxxx from combobox...");
    }
}
