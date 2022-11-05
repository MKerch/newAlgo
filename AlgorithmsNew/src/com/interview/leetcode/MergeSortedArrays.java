package com.interview.leetcode;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {
        int[] ar1 = {1, 2, 4};
        int[] ar2 = {1, 3, 5};
        int[] merged = merge(ar1, ar2);
        System.out.println(Arrays.toString(merged));
    }

    private static int[] merge(int[] ar1, int[] ar2) {
        int[] result = new int[ar1.length + ar2.length];
        for (int i = 0; i < ar2.length; i++) {
            result[i] = ar2[i];
        }
        for (int i = 0; i < ar1.length; i++) {
            result[i+ar1.length] = ar1[i];
        }
        Arrays.sort(result);
        return result;
    }
}

