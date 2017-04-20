package com.tdd.thread.future2;

import java.util.concurrent.Callable;

/**
 * Created by cuong on 12/7/2016.
 */
public class MyExecutorServiceImpl implements MyExecutorService {
    @Override
    public <V> MyFuture<V> startProcess(MyCallable<V> callable) {
        return startProcess(callable, null);
    }

    @Override
    public <V> MyFuture<V> startProcess(MyCallable<V> callable, MyCallback<V> callback) {
        MyFutureImpl<V> future = new MyFutureImpl<V>();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    V result = callable.call();
                    future.setValue(result);

                    if (callback != null) {
                        callback.onComplete(result);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();

        return future;
    }
}
