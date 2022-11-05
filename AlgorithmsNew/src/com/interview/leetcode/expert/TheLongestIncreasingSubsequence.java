package com.interview.leetcode.expert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TheLongestIncreasingSubsequence {

    public static void main(String[] args) {

//        System.out.println(longestIncreasingSubsequence(Arrays.asList(5,2,7,4,3,8)));
        System.out.println(longestIncreasingSubsequence(Arrays.asList(6, 2, 4, 3, 7, 4, 5)));
//        System.out.println(longestIncreasingSubsequence(Arrays.asList(29471, 5242, 21175, 28931, 2889, 7275, 19159, 21773, 1325, 6901)));

    }

    public static int longestIncreasingSubsequence(List<Integer> arr) {
        int maxCount = 0;
        outer:
        for (int i = 0; i < arr.size(); i++) {
            int current = arr.get(i);
            for (int j = i; j < arr.size(); j++) {
                int count = 1;
                int k = j;
                int last = current;
                List<Integer> list = new ArrayList<>(arr);
                boolean isBiggerFound = false;
                while (k < list.size()) {
                    if (last < list.get(k)) {
                        isBiggerFound = true;
                        last = list.get(k);
                        count++;
                        if (count > maxCount) maxCount = count;
                        list.remove(k);
                        continue;
                    }
                    if (k == list.size() - 1) {
                        k = j;
                        last = current;
                        count = 1;
                        if (!isBiggerFound) continue outer;
                    } else k++;
                }
            }
        }
        return maxCount;
    }

}
