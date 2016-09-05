package com.byteslounge.spring.tx.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.jms.*;

/**
 * Created by cuong.bui.manh on 9/5/2016.
 */
@Component("messageListenerExample")
public class JmsMessageReceiver implements MessageListener {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Override
    public void onMessage(Message message) {
        if (message instanceof TextMessage) {
            TextMessage msg = (TextMessage) message;
            try {
                System.out.println("OnMessage Received  :" + msg.getText());
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
    }
}
