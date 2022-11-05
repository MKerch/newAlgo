package com.interview.leetcode;

import java.util.Arrays;

public class ReverceArrayOfString {

    public static void main(String[] args) {
        String[] array = {"h", "m", "d"};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    private static void reverse(String[] v) {
        int i = 0;
        int j = v.length - 1;
        while (i < j) {
            swap(v, i, j);
            i++;
            j--;
        }
    }

    private static void swap(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
