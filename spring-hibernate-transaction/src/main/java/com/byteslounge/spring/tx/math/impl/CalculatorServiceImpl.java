package com.byteslounge.spring.tx.math.impl;

import com.byteslounge.spring.tx.math.CalculatorService;
import org.springframework.stereotype.Service;

/**
 * Created by cuong on 10/3/2016.
 */
@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int add(int num1, int num2) {
        return  num1 + num2;
    }

    @Override
    public int subtract(int num1, int num2) {
        return  num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return  num1 * num2;
    }


}
