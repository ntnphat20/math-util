package com.ntnphat.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilDDTTest {

    public static Object[][] initTestData() {
        return new Object[][] {
            {0, 1L},
            {1, 1L},
            {2, 2L},
            {3, 6L},
            {4, 24L},
            {5, 120L}
        };
    }

    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgumentsReturnsWell(int n, long expected) {
        assertEquals(expected, MathUtil.getFactorial(n));
    }
}
