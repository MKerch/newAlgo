package com.interview.hackersRank.day1;

import java.util.Arrays;
import java.util.List;

public class MinMaxSum {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(769082435, 210437958, 673982045, 375809214, 380564127);
        minMax(arr);
    }

    private static void minMax(List<Integer> arr) {
        long min = arr.get(0);
        long max = arr.get(0);
        long sum = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
            } else if (arr.get(i) > max) {
                max = arr.get(i);
            }
            sum += arr.get(i);
        }
        long minResult = sum - max;
        long maxResult = sum - min;
        System.out.println(minResult + " " + maxResult);
    }

}
