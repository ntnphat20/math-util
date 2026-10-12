package com.ntnphat.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathUtilTest {

    @Test
    public void testFactorialGivenRightArgument5ReturnsWell() {
        long expected = 120;
        long actual = MathUtil.getFactorial(5);
        assertEquals(expected, actual);
    }

    @Test
    public void testFactorialGivenRightArgument6ReturnsWell() {
        long expected = 720;
        long actual = MathUtil.getFactorial(6);
        assertEquals(expected, actual);
    }

    @Test
    public void testFactorialGivenRightArgument0ReturnsWell() {
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        assertEquals(expected, actual);
    }

    @Test
    public void testFactorialGivenWrongArgumentMinus1ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(-1));
    }
}
