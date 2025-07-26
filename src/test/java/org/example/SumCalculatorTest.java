package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
     SumCalculator calc;

    @BeforeEach
    public void beforeEach() {
         calc = new SumCalculator();
    }

    @Test
    void testSumWithPositiveNumber() {
        assertEquals(6, calc.sum(3)); // 1+2+3 = 6
    }

    @Test
    void testSumWithOne() {
        assertEquals(1, calc.sum(1));
    }

    @Test
    void testSumWithZeroThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.sum(0);
        });

        assertEquals("n must be greater than 0", exception.getMessage());
    }
}