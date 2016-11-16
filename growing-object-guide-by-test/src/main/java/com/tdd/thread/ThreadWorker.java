package com.tdd.thread;

/**
 * Created by cuong on 11/16/2016.
 */
public class ThreadWorker implements Runnable{
    private Job job;

    public ThreadWorker(Job job) {
        this.job = job;
    }

    @Override
    public void run() {
        job.doSomething();
    }
}
