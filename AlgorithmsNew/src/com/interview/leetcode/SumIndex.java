package com.interview.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class SumIndex {

    public static void main(String[] args) {
        int[] array = {1, 2, 3,4};
        int[] result = sum(array, 6);
        System.out.println(Arrays.toString(result));
    }

    private static int[] sum(int[] array, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int ar : array) {
            list.add(ar);
        }
        int[] result = new int[2];
        for (int i = 0; i < array.length; i++) {
            int value = target - array[i];
            if (list.contains(value)&&list.indexOf(value)!=i) {
                result[1] = i;
                result[0] = list.indexOf(value);
            }
        }
        return result;
    }

}
