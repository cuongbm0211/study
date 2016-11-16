package com.tdd.thread.syn;

/**
 * Created by cuong on 11/16/2016.
 */
public class Worker2 implements Runnable {
    private ShareResource shareResource;

    public Worker2(ShareResource shareResource) {
        this.shareResource = shareResource;
    }

    @Override
    public void run() {
        shareResource.set();
    }
}
