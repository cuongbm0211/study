package com.tdd.design.pattern.factorykit;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cuong on 11/30/2016.
 */
public class BuilderImpl implements Builder {

    private Map<WeaponType, Weapon> weaponMap;

    @Override
    public void add(WeaponType weaponType, Weapon weapon) {
        weaponMap = new HashMap<>();
        weaponMap.put(WeaponType.AXE, new Axe());
        weaponMap.put(WeaponType.BOW, new Bow());
        weaponMap.put(WeaponType.SPEAR, new Spear());
        weaponMap.put(WeaponType.SWORD, new Sword());
    }
}
