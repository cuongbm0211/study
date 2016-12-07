package com.tdd.design.pattern.abstractfactory;

/**
 * Created by cuong on 11/30/2016.
 */
public class GuiBuilder {
    public void buildWindow(AbstractWidgetFactory fatory) {
        Window window = fatory.createWindow();
        window.setTitle("Office 2007");
    }
}
