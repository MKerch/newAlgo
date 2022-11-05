package com.interview.leetcode.aws.diff;

import java.util.*;
//solution is ok, but I didn't pass time complexity
public class RunningMedium {

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(12, 4, 5, 3, 8, 7);
        List<Double> doubles = runningMedian(a);
        System.out.print(doubles);
    }

    public static List<Double> runningMedian(List<Integer> a) {
        List<Integer> list = new ArrayList<>();
        List<Double> result = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            Integer integer = a.get(i);
            list.add(integer);
            Collections.sort(list);
            Double value = computeMid(list);
            result.add(value);
        }
        return result;
    }

    private static Double computeMid(List<Integer> list) {
        if (list.size() % 2 == 1) {
            int i = list.size() / 2;
            return list.get(i).doubleValue();
        } else {
            int i = list.size() / 2;
            return (list.get(i - 1).doubleValue() + list.get(i).doubleValue()) / 2;
        }
    }


}
