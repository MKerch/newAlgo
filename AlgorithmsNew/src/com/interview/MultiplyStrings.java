package com.interview;

import java.math.BigInteger;

public class MultiplyStrings {

    public static void main(String[] args) {
        String one = "2";
        String two = "4";
        System.out.println(multiply(one, two));

    }

    public static String multiply(String one, String two) {
        return new BigInteger(one)
                .multiply(new BigInteger(two))
                .toString();
    }

}
