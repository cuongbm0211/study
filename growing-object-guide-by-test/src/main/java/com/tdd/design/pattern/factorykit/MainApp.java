package com.tdd.design.pattern.factorykit;

/**
 * Created by cuong on 11/30/2016.
 */
public class MainApp {
    public static void main(String[] args) {
        Weapon axe = WeaponFactory.create(WeaponType.AXE);
    }
}
