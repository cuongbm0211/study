package com.tdd.thread;

/**
 * Created by cuong on 11/16/2016.
 */
public class Job {
    public void doSomething() {
        String threadName = Thread.currentThread().getName();
        System.out.println("thread " + threadName + " do work");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread " + threadName + " done");
    }
}
