package com.tdd.thread.future2;


import java.util.Optional;
import java.util.function.Function;

/**
 * Created by cuong on 12/9/2016.
 */
public class TestOptional {
    public static void main(String[] args) {
        Exception ex = new Exception("CuongBM exeption");
//        new Thread()
        Optional<Exception> exceptionOptional = Optional.of(ex);
//        exceptionOptional = Optional.empty();
//        exceptionOptional = Optional.absent();
//        exceptionOptional = Optional.fromNullable(null);
//        exceptionOptional = Optional.fromNullable(ex);
//        System.out.println(exceptionOptional.isPresent());
        Optional<String> s = exceptionOptional.map(new Function<Exception, String>() {
            @Override
            public String apply(Exception e) {
//                return e.getMessage();
                return null;
            }
        });
        System.out.println(s.orElse("Khong co gia tri nao"));

        if (exceptionOptional.isPresent()) {
//            System.out.println(exceptionOptional.get().getMessage());
//            exceptionOptional.get().printStackTrace();
//            exceptionOptional.map
        }

    }
}
