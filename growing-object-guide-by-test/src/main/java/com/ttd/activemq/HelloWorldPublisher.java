package com.ttd.activemq;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQTextMessage;

import javax.jms.*;

/**
 * Created by cuong on 11/16/2016.
 */
public class HelloWorldPublisher implements Runnable {

    private MessageProducer messageProducer;
    private Session session;

    @Override
    public void run() {
        try {
            ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("failover://(tcp://localhost:61616)");
            Connection connection = connectionFactory.createConnection();

            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

            Destination destination = session.createQueue("queue.test");

            messageProducer = session.createProducer(destination);
            send("Hello from HelloWorldPublisher");

        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

    public void send(String message) throws JMSException {
        TextMessage textMessage = session.createTextMessage(message);
        String threadName = Thread.currentThread().getName();
        System.out.println("threadName " + threadName + ", Message: " + message);
        messageProducer.send(textMessage);
    }
}
