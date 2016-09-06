package com.byteslounge.spring.tx.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by cuong.bui.manh on 9/6/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
@ActiveProfiles("development")
public class HelloWorldTest {

    @Autowired
    HelloWorld helloWorld;

    @Test
    public void should_say_hello() {
        helloWorld.sayHello();
    }
}
