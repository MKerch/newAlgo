package com.interview.leetcode;

import java.util.Arrays;

public class DuplicateZeros {


    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 0, 3, 4, 5, 6, 0, 8, 9};
        zeros(ar);
        Arrays.stream(ar).forEach(System.out::println);
    }

    private static void zeros(int[] ar) {
        int[] result = new int[ar.length];
        for (int i = 0, j = 0; i < ar.length; j++, i++) {
            if (ar.length == j) break;
            if (ar[i] == 0) {
                result[j] = 0;
                result[j++] = 0;
            } else {
                result[j] = ar[i];
            }
        }
        ar=result;
    }
}
