package com.tdd.thread.future2;

/**
 * Created by cuong on 12/9/2016.
 */
public class TestMyExecutorService {
    public static void main(String[] args) {
        MyExecutorService myExecutorService = new MyExecutorServiceImpl();
        MyCallable<String> myCallable = new MyCallableImp();
        MyCallback<String> myCallback = new MyCallbackImpl();
        MyFuture<String> future = myExecutorService.startProcess(myCallable, myCallback);
        System.out.println(future.get());
    }
}
