package com.byteslounge.spring.tx.math.impl;

import com.byteslounge.spring.tx.math.CalculatorService;
import com.byteslounge.spring.tx.math.MathService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by cuong on 10/3/2016.
 */
public class MathServiceImpl implements MathService {
    @Autowired
    CalculatorService calculatorService;

    @Override
    public int add(int num1, int num2) {
        return calculatorService.add(num1, num2);
    }

    @Override
    public int subtract(int num1, int num2) {
        return calculatorService.subtract(num1, num2);
    }

    @Override
    public int multiply(int num1, int num2) {
        return calculatorService.multiply(num1, num2);
    }
}
