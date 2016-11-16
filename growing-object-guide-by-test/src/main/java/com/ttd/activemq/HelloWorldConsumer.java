package com.ttd.activemq;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * Created by cuong on 11/16/2016.
 */
public class HelloWorldConsumer implements Runnable, javax.jms.ExceptionListener {


    @Override
    public void run() {
        try {
            ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("failover://(tcp://localhost:61616)");
            Connection connection = connectionFactory.createConnection();
            connection.start();

            connection.setExceptionListener(this);

            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

            Destination destination = session.createQueue("queue.test");

            MessageConsumer consumer = session.createConsumer(destination);

            while (true) {
                Message message = consumer.receive();
                onMessage(message);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void onMessage(Message message) throws JMSException {
        System.out.println("Receive: " + message);
        if (message instanceof TextMessage) {
            TextMessage textMessage = (TextMessage) message;
            String text = textMessage.getText();
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " Content: " + text);
        } else {
            System.out.println("Not support message type");
        }
    }

    @Override
    public void onException(JMSException exception) {
        System.out.println("Exception occur stop client");
    }
}
