package com.interview;

public class Fibonachi {


    public static void main(String[] args) {
        int n = 1;
        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);

    }
}
