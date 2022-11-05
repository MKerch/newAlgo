package com.interview.leetcode.mid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TheMaximumSubarray {

    public static void main(String[] args) {
        System.out.println(maxSubarray(Arrays.asList(2, -1, 2, 3, 4, -5)));
    }

    public static List<Integer> maxSubarray(List<Integer> arr) {
        int maxSubArray = 0;
        int maxCleanArray = 0;
        List<Integer> resultFinal = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            List<Integer> subList = arr.subList(i, arr.size());
            List<Integer> result = culculate(subList);
            Integer sub = result.get(0);
            Integer clean = result.get(1);
            if (sub > maxSubArray) maxSubArray = sub;
            if (clean > maxCleanArray) maxCleanArray = clean;
        }

        for (int j = arr.size() - 1; j >= 0; j--) {
            List<Integer> subList = arr.subList(0, j);
            List<Integer> result = culculate(subList);
            Integer sub = result.get(0);
            Integer clean = result.get(1);
            if (sub > maxSubArray) maxSubArray = sub;
            if (clean > maxCleanArray) maxCleanArray = clean;
        }

        if (maxSubArray == 0 && maxCleanArray == 0) {
            resultFinal.add(-1);
            resultFinal.add(-1);
        } else if (maxSubArray == 0) {
            resultFinal.add(-1);
        } else if (maxCleanArray == 0) {
            resultFinal.add(-1);
        } else {
            resultFinal.add(maxSubArray);
            resultFinal.add(maxCleanArray);
        }
        return resultFinal;
    }

    private static List<Integer> culculate(List<Integer> subList) {
        List<Integer> result = new ArrayList<>();
        int sum = 0;
        int sumWithOutMinus = 0;
        for (int i = 0; i < subList.size(); i++) {
            Integer current = subList.get(i);
            sum += current;
            if (current > 0) sumWithOutMinus += current;
        }
        result.add(sum);
        result.add(sumWithOutMinus);
        return result;
    }

}
