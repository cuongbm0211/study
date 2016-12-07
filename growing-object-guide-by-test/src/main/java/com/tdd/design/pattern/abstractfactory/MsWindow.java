package com.tdd.design.pattern.abstractfactory;

/**
 * Created by cuong on 11/30/2016.
 */
public class MsWindow implements Window {
    private String title;

    @Override
    public void setTitle(String title) {
        this.title = title;
    }
}
