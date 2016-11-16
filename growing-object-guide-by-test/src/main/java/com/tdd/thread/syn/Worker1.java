package com.tdd.thread.syn;

/**
 * Created by cuong on 11/16/2016.
 */
public class Worker1 implements Runnable {
    private ShareResource shareResource;

    public Worker1(ShareResource shareResource) {
        this.shareResource = shareResource;
    }

    @Override
    public void run() {
        shareResource.get();
    }
}
