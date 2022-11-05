package com.interview.hackerrank.basic;

public class FibonacciModified {

    //todo
    public static void main(String[] args) {
        int n = 10;
//        System.out.println(fibonacci(n));
        System.out.println(fibonacci2(n));
    }

    private static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    private static int fibonacci2(int n) {
        if (n == 1) return 0;
        int result = 0;
        for (int i = 0; i < n - 1; i++) {
            result = i + i + 1;
        }
        return result;
    }

}
