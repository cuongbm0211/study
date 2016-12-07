package com.tdd.lambda.supplier;

import java.util.function.Supplier;

/**
 * Created by cuong on 11/29/2016.
 */
public class SupplierImpl implements Supplier<String> {
    @Override
    public String get() {
        return "Hello world!";
    }
}
