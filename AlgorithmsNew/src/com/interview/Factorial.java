package com.interview;

public class Factorial {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(factorial(n));
    }

    private static int factorial(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
