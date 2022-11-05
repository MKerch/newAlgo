package com.interview.leetcode;


import java.math.BigInteger;

public class BinarySum {
    public static void main(String[] args) {
        String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";

        String sum = sum(a, b);
        System.out.println(sum);
    }

    private static String sum(String a, String b) {
        BigInteger bigInteger = new BigInteger(a, 2);
        BigInteger bigInteger2 = new BigInteger(b, 2);
        return bigInteger.add(bigInteger2).toString(2);
    }

}
