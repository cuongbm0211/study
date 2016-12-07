package com.tdd.thread.future;

import java.util.concurrent.Callable;

/**
 * Created by cuong on 12/5/2016.
 */
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("Start" + Thread.currentThread().getName());
        Thread.sleep(10000);
        System.out.println("End" + Thread.currentThread().getName());
        return Thread.currentThread().getName();
    }
}
