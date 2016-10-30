package com.dsa.array;

/**
 * Created by CuongBM on 10/29/2016.
 */
public class MyArray {
    private static final int MAX_CAPACITY = 100;
    private int[] arrays = new int[MAX_CAPACITY];

    public static void main(String[] args) {
        int[] initialArrays = new int[MAX_CAPACITY];
        initialArrays[0] = 1;
        initialArrays[1] = 2;
        initialArrays[2] = 3;
        initialArrays[3] = 4;
        initialArrays[4] = 5;

        MyArray myArray = new MyArray(initialArrays);

        myArray.insert(10, 3);
        myArray.traverse();

    }

    public MyArray(int[] arrays) {
        this.arrays = arrays;
    }

    public void insert(int value, int index) {
        // step 1: save all value from index to end to another arrays
        int[] arrayStore = new int[MAX_CAPACITY];
        for (int i = index; i <arrays.length ; i++) {
            arrayStore[i] = arrays[i];
        }

        // step 2: insert value to arrays in position index
        arrays[index] = value;

        // step 3: copy all value
        for (int i = index + 1; i <arrays.length ; i++) {
            arrays[i] = arrayStore[i - 1];
        }
    }

    private void traverse() {
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
    }
}
