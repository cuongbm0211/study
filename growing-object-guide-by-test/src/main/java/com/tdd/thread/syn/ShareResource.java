package com.tdd.thread.syn;

/**
 * Created by cuong on 11/16/2016.
 */
public class ShareResource {

    public synchronized void get() {
        System.out.println("Starting get value ...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End get value ...");
    }

    public synchronized void set() {
        System.out.println("Starting set value ...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End set value ...");
    }

}
