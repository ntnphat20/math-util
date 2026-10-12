package com.ntnphat.mathutil.core;

public class MathUtil {

    /**
     * Calculates factorial of an integer n (n!).
     * n! = 1 * 2 * 3 * ... * n
     * 0! = 1! = 1
     * Factorial grows very fast, 20! fits in long (approx 2.4 * 10^18).
     * 21! causes long overflow.
     * Therefore, only accepts 0 <= n <= 20.
     * Throws IllegalArgumentException if n < 0 or n > 20.
     */
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument: n must be between 0 and 20.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
