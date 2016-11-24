package com.tdd.thread.wait.notify;

/**
 * Created by cuong on 11/21/2016.
 */
public class Data {
    private int a;
    private int b;

    private int flag;
    private static final int TIME_SLEEP = 10000;

    public Data(int flag) {
        this.flag = flag;
    }


    public synchronized void setA(int a) {
        System.out.println("Thread 1, acquire monitor object, sleep 20s ");
        try {
            Thread.sleep(TIME_SLEEP);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while (flag != 1) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread 1, setA: " + a);
        this.a = a;
        this.flag = 2;
        this.notifyAll();

        System.out.println("Thread 1 notify but keep lock in 10s");
        try {
            Thread.sleep(TIME_SLEEP);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void setB(int b) {
        System.out.println("Thread 2, acquire monitor object, sleep 20s ");
        try {
            Thread.sleep(TIME_SLEEP);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (this.flag != 2) {
            try {
                System.out.println("while thread 2");
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread 2, setB: " + b);
        this.b = b;
        this.flag = 3;
        this.notifyAll();
    }

    public synchronized int calculateSum() {
        System.out.println("Thread 3, acquire monitor object, sleep 20s ");
        try {
            Thread.sleep(TIME_SLEEP);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (this.flag != 3) {
            try {
                System.out.println("while thread 3");
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.flag = 1;
        this.notifyAll();
        return a + b;
    }
}
