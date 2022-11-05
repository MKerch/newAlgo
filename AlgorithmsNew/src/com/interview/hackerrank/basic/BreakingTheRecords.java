package com.interview.hackerrank.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreakingTheRecords {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1);
        System.out.println(breakingRecords(list));
    }

    public static List<Integer> breakingRecords(List<Integer> scores) {
        int min = scores.get(0);
        int max = scores.get(0);
        int minCount = 0;
        int maxCount = 0;
        for (int i = 1; i < scores.size(); i++) {
            if (min > scores.get(i)) {
                min = scores.get(i);
                minCount++;
            }
            if (max < scores.get(i)) {
                max = scores.get(i);
                maxCount++;
            }
        }
        List<Integer> result = new ArrayList<>();
        result.add(maxCount);
        result.add(minCount);
        return result;

    }

}
