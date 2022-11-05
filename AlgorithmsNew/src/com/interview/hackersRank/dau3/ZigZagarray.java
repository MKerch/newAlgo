package com.interview.hackersRank.dau3;

import java.util.Arrays;

public class ZigZagarray {

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 8};
        zig(array);
        System.out.println(Arrays.toString(array));
    }

    private static void zig(int[] array) {
        int start = 0;
        int end = array.length-1;
        while (start < end) {
            swap(array, start, end);
            start++;
            end--;
        }
    }

    private static void swap(int[] array, int start, int end) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
        }
    }
}
