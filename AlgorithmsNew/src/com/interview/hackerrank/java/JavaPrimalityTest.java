package com.interview.hackerrank.java;

import java.math.BigInteger;

public class JavaPrimalityTest {

    public static void main(String[] args) {

    }

    public static void isPrime(String s){
        BigInteger integer = new BigInteger(s);
        boolean probablePrime = integer.isProbablePrime(2);
        if(probablePrime) System.out.println("prime");
        else System.out.println("not prime");
    }

}
