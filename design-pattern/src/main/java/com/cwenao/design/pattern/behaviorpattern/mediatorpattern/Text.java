/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.mediatorpattern;

/**
 * @author cwenao
 * @version $Id Text.java, v 0.1 2017-12-15 09:21 cwenao Exp $$
 */
public class Text {
    public static void main(String[] args) {

        ComboBoxComponent comboBoxComponent = new ComboBoxComponent();
        ButtonComponent addButon = new ButtonComponent();

        ComponentMediator componentMediator = new ComponentMediator();
        componentMediator.setBoxComponent(comboBoxComponent);
        componentMediator.setButtonComponent(addButon);

        comboBoxComponent.setMediator(componentMediator);
        addButon.setMediator(componentMediator);

        addButon.changed();
        comboBoxComponent.changed();

    }
}
