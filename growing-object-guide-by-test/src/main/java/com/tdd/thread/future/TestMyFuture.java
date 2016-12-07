package com.tdd.thread.future;

import com.tdd.future.task.*;


import java.util.concurrent.*;

/**
 * Created by cuong on 12/5/2016.
 */
public class TestMyFuture {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Future<String> future = executor.submit(new MyCallable());
        executor.submit(new MyCallable());
        executor.submit(new MyCallable());
        executor.submit(new MyCallable());
        executor.submit(new MyCallable());
        executor.submit(new MyCallable());
        executor.submit(new MyCallable());
        executor.submit(new MyCallable());
        executor.submit(new MyCallable());
        executor.submit(new MyCallable());
        executor.submit(new MyCallable());
        Future<String> future1 = executor.submit(new MyCallable());
        try {
            String result = future.get();
            future1.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}
