package com.interview.leetcode.general;

import java.util.Arrays;

public class DuplicateZeros {

    public static void main(String[] args) {
        duplicateZeros(new int[]{1, 0, 2, 3, 0, 4, 5, 0});
    }

    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int j = i;
                while (j < arr.length-1) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    j++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
