package com.tdd.thread.future2;

/**
 * Created by cuong on 12/7/2016.
 */
public class MyFutureImpl<V> implements MyFuture<V> {
    private volatile V value;
    private final Object lock = new Object();
    private int currentStatus;

    private static final int COMPLETE = 1;

    @Override
    public V get() {
        synchronized (lock) {
            while (currentStatus != COMPLETE) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            return value;
        }
    }

    public void setValue(V value) {
        synchronized (lock) {
            this.value = value;
            currentStatus = COMPLETE;
            lock.notify();
        }
    }
}
