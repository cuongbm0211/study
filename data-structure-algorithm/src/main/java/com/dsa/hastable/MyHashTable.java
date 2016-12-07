package com.dsa.hastable;

/**
 * Created by CuongBM on 11/13/2016.
 */
public class MyHashTable {
    private static final int SIZE = 100;
    private Item[] hashArrays;

    public MyHashTable() {
        hashArrays = new Item[SIZE];
    }

    public void put(int key, int value) {
        Item item = new Item(key, value);
        int hashIndex = hasCode(key);

        // Neu nhu put(1, value), put(1, value) thi lam sao
        // Minh muon change
        // Phai kiem tra key
        while (hashArrays[hashIndex] != null) {
            hashIndex++;
        }

        hashArrays[hashIndex] = item;
    }

    public int get(int key) {
        int hashIndex = hasCode(key);
        return hashArrays[hashIndex].getValue();
    }

    private int hasCode(int key) {
//        System.out.println("key = [" + key + "]" + ", value " + (key % SIZE));
        return key % SIZE;
    }
}
