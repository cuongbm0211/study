package com.tdd.thread.future2;

import java.util.concurrent.Callable;

/**
 * Created by cuong on 12/7/2016.
 */
public interface MyExecutorService {
    <V> MyFuture<V> startProcess(MyCallable<V> callable);
    <V> MyFuture<V> startProcess(MyCallable<V> callable, MyCallback<V> callback);
}
