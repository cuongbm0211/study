package com.tdd.future.task;

import com.google.common.base.Stopwatch;

import java.util.concurrent.*;

/**
 * Created by cuong on 11/7/2016.
 */
public class MyCallableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask<String> futureTask1 = new FutureTask<>(new MyCallable(3000));
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.submit(futureTask1);

        if (futureTask1.isDone()) {
            System.out.println("Task is done, don't wait");
        }

        Stopwatch stopwatch = Stopwatch.createStarted();
        System.out.println("Waiting for result " + futureTask1.get());
        stopwatch.stop();

        if (futureTask1.isDone()) {
            System.out.println("Task is done, time consume " + stopwatch.elapsed(TimeUnit.MILLISECONDS));
            executorService.shutdown();
        }
    }
}
