package com.tdd.thread.future;

/**
 * Created by cuong on 12/1/2016.
 */
public class TestFuture {
    public static void main(String[] args) {
        System.out.println("Create another thread");
        Object lock = new Object();
        final String[] resultOfAnotherThread = new String[100];
        final boolean[] isAnotherThreadDone = new boolean[1];
        Thread anotherThread = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("Cuong-AnotherThread");
                System.out.println("Another thread sleep 10s");
                try {
                    Thread.sleep(10000);
                    resultOfAnotherThread[0] = "I am done";
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    isAnotherThreadDone[0] = true;

                    // How to know done with error ...
                }
                System.out.println("Another thread done");

                // Notify when done
                synchronized (lock) {
                    lock.notifyAll();
                }
            }
        });
        anotherThread.start();

        // How to waiting here for anotherThread done, then print finish on main
        // Cai gi do chung .wait()
        // Neu anotherThread bi exception thi phai lam sao

        System.out.println("Main thread sleep 20s --> miss notify signal");
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Wait forever");

        if (!isAnotherThreadDone[0]) {
            synchronized (lock) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

        System.out.println("Thread main finish, result of anotherThread: " + resultOfAnotherThread[0]);
    }
}
