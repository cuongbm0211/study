package com.tdd.design.pattern.abstractfactory;

/**
 * Created by cuong on 11/30/2016.
 */
public class MacWindowWidgetFactory implements AbstractWidgetFactory {
    @Override
    public Window createWindow() {
        return new MacWindow();
    }
}
