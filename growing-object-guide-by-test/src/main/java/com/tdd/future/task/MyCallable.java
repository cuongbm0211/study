package com.tdd.future.task;

import java.util.concurrent.Callable;

/**
 * Created by cuong on 11/7/2016.
 */
public class MyCallable implements Callable<String> {
    private long timeSleep;

    public MyCallable(long timeSleep) {
        this.timeSleep = timeSleep;
    }

    @Override
    public String call() throws Exception {
        System.out.println("Sleep " + timeSleep + " ms");
        Thread.sleep(this.timeSleep);
        return "Done";
    }
}
