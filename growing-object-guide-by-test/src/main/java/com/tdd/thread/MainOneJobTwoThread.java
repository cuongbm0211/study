package com.tdd.thread;

/**
 * Created by cuong on 11/16/2016.
 */
public class MainOneJobTwoThread {
    public static void main(String[] args) {
        Job job = new Job();
        ThreadWorker threadWorker = new ThreadWorker(job);

        Thread thread1 = new Thread(threadWorker);
        Thread thread2 = new Thread(threadWorker);

        thread1.start();
        thread2.start();

    }
}
