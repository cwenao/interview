/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.mediatorpattern;

/**
 * @author cwenao
 * @version $Id ComponentMediator.java, v 0.1 2017-12-15 09:16 cwenao Exp $$
 */
public class ComponentMediator extends AbstractMediator{

    private ButtonComponent buttonComponent;
    private ComboBoxComponent boxComponent;

    @Override
    public void componentChanged(Component component) {
        if (component == buttonComponent) {
            System.out.println("to clicked th button =======> ");
            boxComponent.update();
        } else if (component == boxComponent) {
            System.out.println("to select from box");
            boxComponent.select();
        }
    }

    public void setButtonComponent(ButtonComponent buttonComponent) {
        this.buttonComponent = buttonComponent;
    }

    public void setBoxComponent(ComboBoxComponent boxComponent) {
        this.boxComponent = boxComponent;
    }
}
