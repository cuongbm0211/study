package com.tdd.thread.future2;

/**
 * Created by cuong on 12/9/2016.
 */
public class MyCallbackImpl implements MyCallback<String> {
    @Override
    public void onComplete(String value) {
        System.out.println("MyCallback print result: " + value);
    }
}
