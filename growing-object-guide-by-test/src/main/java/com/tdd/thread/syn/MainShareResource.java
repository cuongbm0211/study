package com.tdd.thread.syn;

/**
 * Created by cuong on 11/16/2016.
 */
public class MainShareResource {
    public static void main(String[] args) {
        ShareResource shareResource = new ShareResource();
        Worker1 worker1 = new Worker1(shareResource);
        Worker2 worker2 = new Worker2(shareResource);

        Thread thread1 = new Thread(worker1);
        Thread thread2 = new Thread(worker2);

        thread1.start();
        thread2.start();
    }
}
