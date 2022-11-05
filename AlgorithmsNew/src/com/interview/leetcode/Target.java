package com.interview.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Target {

    public static void main(String[] args) {
        int[] array = {10, 1, 2, 7, 6, 1, 5};
        List<List<Integer>> result = compute(array, 8);
        System.out.println(result);
    }

    private static List<List<Integer>> compute(int[] array, int target) {
        List<List<Integer>> resultList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            List<Integer> list = new ArrayList<>();
            if (array[i] > target) continue;
            for (int j = 0; j < array.length; j++) {
                if (target - array[j] >= 0) {
                    list.add(array[j]);
                    resultList.add(list);
                }
            }
        }
        return resultList;
    }

}
