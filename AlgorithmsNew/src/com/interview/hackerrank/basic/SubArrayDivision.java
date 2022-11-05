package com.interview.hackerrank.basic;

import java.util.Arrays;
import java.util.List;

public class SubArrayDivision {

    public static void main(String[] args) {
//        System.out.println(birthday(Arrays.asList(2, 2, 1, 3, 2), 4, 2));
        System.out.println(birthday(Arrays.asList(5, 2, 2, 1, 5, 3, 2), 9, 3));
    }

    public static int birthday(List<Integer> s, int d, int m) {
        if (s.size() == m && s.get(0) == d) return 1;
        int count = 0;
        outer:
        for (int i = 0; i < s.size(); i++) {
            int sum = s.get(i);
            int mCount = 1;
            for (int j = i + 1; j < s.size(); j++) {
                mCount++;
                sum += s.get(j);
                if (sum == d && mCount == m) {
                    count++;
                    continue outer;
                } else if (sum > d || mCount > m) continue outer;
            }
        }
        return count;
    }

}
