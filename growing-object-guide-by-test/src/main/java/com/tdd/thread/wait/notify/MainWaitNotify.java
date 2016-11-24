package com.tdd.thread.wait.notify;

import java.util.Random;

/**
 * Created by cuong on 11/21/2016.
 */
public class MainWaitNotify {
    static Data shareResource;

    public static void main(String[] args) {

        shareResource = new Data(1);

        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    int a = new Random().nextInt(100);
                    shareResource.setA(a);

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    int b = new Random().nextInt(100);
                    shareResource.setB(b);

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread threadC = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(shareResource.calculateSum());

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        threadA.start();
        threadB.start();
        threadC.start();


    }
}
