package com.tdd.design.pattern.abstractfactory;

/**
 * Created by cuong on 11/30/2016.
 */
public class TestAbstractFactory {
    public static void main(String[] args) {
        AbstractWidgetFactory widgetFactory = null;
        if (Platform.currentPlatform() == "window") {
            widgetFactory = new MsWindowWidgetFactory();
        } else if  (Platform.currentPlatform() == "macOs") {
            widgetFactory = new MacWindowWidgetFactory();
        }

        GuiBuilder client = new GuiBuilder();
        client.buildWindow(widgetFactory);
    }
}
