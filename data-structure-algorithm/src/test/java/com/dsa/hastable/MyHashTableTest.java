package com.dsa.hastable;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by CuongBM on 11/13/2016.
 */
public class MyHashTableTest {

    private MyHashTable myHashTable;

    @Before
    public void setUp() {
        myHashTable = new MyHashTable();
    }

    @Test
    public void testPut() {
        int key = 1;
        int value = 100;
        myHashTable.put(key, value);
        myHashTable.put(101, 200);

        Assert.assertEquals(value, myHashTable.get(key));

    }

    public void testGet() throws Exception {

    }

}