package com.tdd.lambda.supplier;

import java.util.function.Supplier;

/**
 * Created by cuong on 11/29/2016.
 */
public class TestSupplier {
    public static void main(String[] args) {
//        java7Style();
        lambdaExpressionStyle();
    }

    private static void lambdaExpressionStyle() {
        Supplier<String> supplier = () -> "Hello world";
        System.out.println(supplier.get());
    }

    private static void java7Style() {
        Supplier<String> supplier = new SupplierImpl();
        System.out.println(supplier.get());
    }
}
