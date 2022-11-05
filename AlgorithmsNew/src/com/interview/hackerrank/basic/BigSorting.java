package com.interview.hackerrank.basic;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BigSorting {


    public static void main(String[] args) {

        print(bigSorting(
                Arrays.asList("6", "31415926535897932384626433832795", "1", "3", "10", "3", "5")));

    }

    public static List<String> bigSorting(List<String> unsorted) {
        for (int i = 1; i < unsorted.size(); ++i) {
            BigInteger key = new BigInteger(unsorted.get(i));
            int j = i - 1;
            while (j >= 0 && new BigInteger(unsorted.get(j)).compareTo(key) > 0) {
                unsorted.set(j + 1, unsorted.get(j));
                j = j - 1;
            }
            unsorted.set(j + 1, key.toString());
        }

        return unsorted;
    }

    private static void print(List<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
