package com.interview.leetcode.mid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumSubarraySum {

    public static void main(String[] args) {

        List<Long> list = Arrays.asList(3l, 3l, 9l, 9l, 5l);
        System.out.println(maximumSum(list, 7));

    }

    public static long maximumSum(List<Long> a, long m) {
        long sum = 0;
        long maxMod = 0;
        for (int i = 0; i < a.size(); i++) {
            Long current = a.get(i);
            long mod = current % m;
            if (maxMod < mod) maxMod = mod;
            sum = 0;
            for (int j = i; j < a.size(); j++) {
                sum += a.get(j);
                long sumMod = sum % m;
                if (sumMod > maxMod) maxMod = sumMod;
            }
        }
        return maxMod;
    }


}
