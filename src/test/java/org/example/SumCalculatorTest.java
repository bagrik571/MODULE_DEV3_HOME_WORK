package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    private SumCalculator sumCalculator;
    @BeforeEach
void setUp(){
        sumCalculator = new SumCalculator();
    }

    @Test
    void testSumWithOne() {
        int actualResult = sumCalculator.sum(1);
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testSumWithThree() {
        int actualResult = sumCalculator.sum(3);
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testSumWithZeroThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            sumCalculator.sum(0);
        });
    }
}