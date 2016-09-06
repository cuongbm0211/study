package com.byteslounge.spring.tx.test;

import org.springframework.stereotype.Service;

/**
 * Created by cuong.bui.manh on 9/6/2016.
 */
@Service
public class HelloWorldImpl implements HelloWorld {
    @Override
    public void sayHello() {
        System.out.println("Hello the world");
    }

}
