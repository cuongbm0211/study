package com.tdd.lambda.comsumer;

import java.util.function.Consumer;

/**
 * Created by cuong on 11/29/2016.
 */
public class ConsummerImpl implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
