package com.interview.hackerrank.basic;

import java.util.Arrays;
import java.util.List;

public class LisaWorkbook {

    public static void main(String[] args) {
        System.out.println(workbook(5, 3, Arrays.asList(4, 2, 6, 1, 10)));
    }

    public static int workbook(int n, int k, List<Integer> arr) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            Integer current = arr.get(i);
            if (current % k == 0 && i != n - 1) {
                count += 1;
            }
        }
        return count;
    }

}
