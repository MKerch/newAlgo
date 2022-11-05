package com.interview.hackerrank.basic;

import java.math.BigInteger;

public class ModifiedKaprekarNumbers {

    public static void main(String[] args) {
//        kaprekarNumbers(100, 300);
//        kaprekarNumbers(1, 100);
        kaprekarNumbers(22222, 99999);
    }

    public static void kaprekarNumbers(int p, int q) {
        boolean isFound = false;
        for (int i = p; i <= q; i++) {
            int kar = culculate(i);
            if (kar != -1) {
                System.out.println(kar);
                isFound = true;
            }
        }
        if (!isFound) System.out.println("INVALID RANGE");
    }

    private static int culculate(int i) {
        if (i == 1) return i;
        else if (i < 9) return -1;
        BigInteger sq = new BigInteger(String.valueOf(i)).multiply(new BigInteger(String.valueOf(i)));
        String s = String.valueOf(sq);
        String s1 = s.substring(0, s.length() / 2);
        String s2 = s.substring(s.length() / 2);
        int first = Integer.parseInt(s1);
        int second = Integer.parseInt(s2);
        if (first + second == i) return i;
        else return -1;
    }


}
