package com.tdd.thread.future2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by cuong on 12/9/2016.
 */
public class TestThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService1 = Executors.newFixedThreadPool(10);
        executorService1.execute(getTask());
        executorService1.execute(getTask());
        executorService1.execute(getTask());
        executorService1.execute(getTask());
        executorService1.execute(getTask());
        executorService1.execute(getTask());
        executorService1.execute(getTask());
        executorService1.execute(getTask());
        executorService1.execute(getTask());
        executorService1.execute(getTask());

        ExecutorService executorService2 = Executors.newFixedThreadPool(10);
        executorService2.execute(getTask());
        executorService2.execute(getTask());
        executorService2.execute(getTask());
        executorService2.execute(getTask());
        executorService2.execute(getTask());
        executorService2.execute(getTask());
        executorService2.execute(getTask());
        executorService2.execute(getTask());
        executorService2.execute(getTask());


    }

    private static Runnable getTask() {
        return new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " done!");
            }
        };
    }
}
