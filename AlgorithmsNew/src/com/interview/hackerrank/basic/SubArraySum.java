package com.interview.hackerrank.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArraySum {

    public static void main(String[] args) {

        System.out.println(
                findSum(Arrays.asList(5, 10, 10), Arrays.asList(Arrays.asList(1, 2, 5))));

    }

    public static List<Long> findSum(List<Integer> numbers, List<List<Integer>> queries) {
        List<Long> result = new ArrayList<>();
        for (int j = 0; j < queries.size(); j++) {
            List<Integer> list = queries.get(j);
            Integer start = list.get(0);
            Integer end = list.get(1);
            Integer x = list.get(2);
            long sum = 0;
            for (int i = start - 1; i < end; i++) {
                if (numbers.get(i) == 0) {
                    sum += x;
                } else sum += numbers.get(i);
            }
            result.add(sum);
        }
        return result;
    }

}
