package com.tdd.lambda.comsumer;

import java.util.function.Consumer;

/**
 * Created by cuong on 11/29/2016.
 */
public class TestConsummer {
    public static void main(String[] args) {
//        java7Style();
//        lambdaExpressionStyle();
        lambdaExpressionStyleMethodReference();
    }

    private static void lambdaExpressionStyleMethodReference() {
        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello");
        consumer.accept("world!");
    }

    private static void lambdaExpressionStyle() {
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Hello");
        consumer.accept("world!");
    }

    private static void java7Style() {
        Consumer<String> consumer = new ConsummerImpl();
        consumer.accept("Hello");
        consumer.accept("world!");
    }
}
