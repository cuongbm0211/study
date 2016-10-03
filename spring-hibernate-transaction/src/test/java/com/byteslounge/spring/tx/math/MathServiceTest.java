package com.byteslounge.spring.tx.math;

import com.byteslounge.spring.tx.math.impl.CalculatorServiceImpl;
import com.byteslounge.spring.tx.math.impl.MathServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;

/**
 * Created by cuong on 10/3/2016.
 */
@RunWith(MockitoJUnitRunner.class)
public class MathServiceTest {

    @InjectMocks
    MathServiceImpl mathService;

//    @Mock
    @Spy
    CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    public void use_spy() {
        when(calculatorService.add(anyInt(), anyInt())).thenReturn(100);
        assertEquals(mathService.add(1, 2), 100);
        assertEquals(mathService.multiply(2, 3), 6); // If use mock --> mathService.multiply(2, 3) will return default value
    }

}