package com.byteslounge.spring.tx;

import java.util.List;

import com.byteslounge.spring.tx.jms.JmsMessageSender;
import com.byteslounge.spring.tx.test.OuterBean;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.byteslounge.spring.tx.model.User;
import com.byteslounge.spring.tx.user.UserManager;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import javax.jms.Queue;

public class Main {
    public static void main(String[] args) {
        // Initial spring context with profiles
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ConfigurableEnvironment env = (ConfigurableEnvironment) ctx.getEnvironment();
        env.setDefaultProfiles("production");
        ctx.load("spring.xml");
        ctx.refresh();

        // get bean from context
        JmsMessageSender jmsMessageSender = (JmsMessageSender) ctx.getBean("jmsMessageSender");

        // send to default destination
        jmsMessageSender.send("hello JMS");

        // send to a code specified destination
        Queue queue = new ActiveMQQueue("AnotherDest");
        jmsMessageSender.send(queue, "hello Another Message");
    }
}

