package com.ttd.activemq;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by cuong on 11/16/2016.
 */
public class ThreadForPublish implements Runnable {
    private BlockingQueue<String> queue = new ArrayBlockingQueue<String>(10000);
    private  HelloWorldPublisher publisher;

    public ThreadForPublish(HelloWorldPublisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.currentThread().setName("Thread-ThreadForPublish");
                String message = queue.take();
                publisher.send(message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sendMessage(String message) {
        try {
            queue.put(message);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
