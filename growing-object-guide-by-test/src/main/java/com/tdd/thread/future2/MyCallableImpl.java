package com.tdd.thread.future2;

/**
 * Created by cuong on 12/7/2016.
 */
class MyCallableImp implements MyCallable<String> {
    @Override
    public String call() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "I am done";
    }
}
