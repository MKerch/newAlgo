package com.interview;

import java.math.BigInteger;

public class DevideTwoIntegers {

    public static void main(String[] args) {
        //-2147483648
        //2147483647
        int result = devide(-2147483648, -1);
        System.out.println(result);
    }

    private static int devide(int i, int j) {
        BigInteger one = new BigInteger(String.valueOf(i));
        BigInteger two = new BigInteger(String.valueOf(j));
        BigInteger result = one.divide(two);
        if (result.compareTo(new BigInteger(String.valueOf(Integer.MAX_VALUE))) > 0)
            return Integer.MAX_VALUE;
        else if (result.compareTo(new BigInteger(String.valueOf(Integer.MIN_VALUE))) < 0)
            return Integer.MIN_VALUE;
        return i / j;
    }

}
