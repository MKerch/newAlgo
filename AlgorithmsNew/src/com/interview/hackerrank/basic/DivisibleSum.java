package com.interview.hackerrank.basic;

import java.util.Arrays;
import java.util.List;

public class DivisibleSum {

    public static void main(String[] args) {
        System.out.println(divisibleSumPairs(100, 66, Arrays.asList(50, 44, 77, 66, 70, 58, 9, 59, 74, 82, 87, 15, 10, 95, 10, 81, 2, 4, 87, 85, 28, 96, 76, 18, 86, 91, 94, 59, 19, 58, 98, 48, 38, 70, 36, 38, 66, 9, 72, 54, 23, 23, 17, 18, 8, 16, 9, 56, 12, 59, 73, 31, 10, 62, 83, 84, 28, 91, 29, 22, 73, 22, 3, 75, 26, 31, 93, 57, 15, 32, 46, 74, 99, 10, 15, 58, 60, 53, 41, 49, 71, 59, 4, 20, 38, 78, 1, 94, 76, 5, 70, 68, 42, 34, 77, 28, 19, 25, 20, 15)));
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                if (i < j && (ar.get(i) + ar.get(j)) % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }


}
