package com.tdd.thread.future2;

/**
 * Created by cuong on 12/9/2016.
 */
public interface MyCallback<V> {
    void onComplete(V value);
}
