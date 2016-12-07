package com.tdd.design.pattern.abstractfactory;

/**
 * Created by cuong on 11/30/2016.
 */
public class MsWindowWidgetFactory implements AbstractWidgetFactory {
    @Override
    public Window createWindow() {
        return new MsWindow();
    }
}
