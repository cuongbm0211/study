package com.ttd.activemq;

import javax.jms.JMSException;

/**
 * Created by cuong on 11/16/2016.
 */
public class MainActiveMq {
    public static void main(String[] args) throws JMSException, InterruptedException {
//        Thread threadConsummer = new Thread(new HelloWorldConsumer());
//        threadConsummer.setName("MyThreadName");
//        threadConsummer.start();

        HelloWorldPublisher publisher = new HelloWorldPublisher();
        Thread threadPublisher = new Thread(publisher);
        threadPublisher.start();


        Thread.sleep(1000);
        publisher.send("111111");
        publisher.send("222222");
        publisher.send("333333");
        publisher.send("444444");

        ThreadForPublish threadForPublish = new ThreadForPublish(publisher);
        Thread threadPublish = new Thread(threadForPublish);
        threadPublish.start();
        Thread.sleep(1000);

        threadForPublish.sendMessage("aaaaaaaaa");
        threadForPublish.sendMessage("bbbbbbbb");
        threadForPublish.sendMessage("cccccccc");
        threadForPublish.sendMessage("ddddddd");
    }
}
