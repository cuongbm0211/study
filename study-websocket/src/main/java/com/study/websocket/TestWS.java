package com.study.websocket;

import java.io.IOException;

/**
 * Created by cuong on 11/10/2016.
 */
public class TestWS {
    public WebSocketClient wsc;
    public TestWS() {
    }

    public static void main(String[] args) throws InterruptedException, IOException
    {
        TestWS t = new TestWS();
        t.Start();
        Thread.sleep(1000);
    }

    public void Start() throws InterruptedException, IOException {

        wsc = new WebSocketClient();
//        wsc.callback = this;
        wsc.Connect("ws://localhost:8890999/");
        Thread.sleep(1000);
        wsc.Disconnect();
    }
}
