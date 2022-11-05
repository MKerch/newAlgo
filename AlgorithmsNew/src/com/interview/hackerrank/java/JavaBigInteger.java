package com.interview.hackerrank.java;

import java.math.BigInteger;

public class JavaBigInteger {

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        print(a,b);
    }

    private static void print(int a, int b) {
        BigInteger bigIntegerA = new BigInteger(String.valueOf(a));
        BigInteger bigIntegerB = new BigInteger(String.valueOf(b));
        System.out.println(bigIntegerA.add(bigIntegerB));
        System.out.println(bigIntegerA.multiply(bigIntegerB));
    }
}
