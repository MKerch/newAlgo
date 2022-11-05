package com.interview.hackerrank.mid;

import java.math.BigInteger;

public class ExtraLongFactorials {

    public static void main(String[] args) {

        extraLongFactorials(30);

    }

    public static void extraLongFactorials(int n) {
        BigInteger bigInteger = new BigInteger(String.valueOf(1));
        while (n != 1) {
            bigInteger = bigInteger.multiply(new BigInteger(String.valueOf(n)));
            n--;
        }
        System.out.println(bigInteger);
    }

}
