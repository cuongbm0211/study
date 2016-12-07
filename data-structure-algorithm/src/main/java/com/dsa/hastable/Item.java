package com.dsa.hastable;

/**
 * Created by CuongBM on 11/13/2016.
 */
public class Item {
    private int key;
    private int value;

    public Item(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
