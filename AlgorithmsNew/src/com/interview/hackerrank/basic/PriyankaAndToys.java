package com.interview.hackerrank.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PriyankaAndToys {

    public static void main(String[] args) {
//        System.out.println(toys(Arrays.asList(16, 18, 10, 13, 2, 9, 17, 17, 0, 19)));
        System.out.println(toys(Arrays.asList(1, 2, 3, 21, 7, 12, 14, 21)));
    }

    public static int toys(List<Integer> w) {

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < w.size(); i++) {
            if (w.get(i) < min) min = w.get(i);
        }

        Collections.sort(w);
        int count = 0;
        int current = 4 + min;
        boolean isInRange = false;
        for (int i = 0; i < w.size(); i++) {
            if (w.get(i) <= current) {
                if (!isInRange) {
                    count++;
                    isInRange = true;
                }
            } else {
                current = w.get(i) + 4;
                isInRange = false;
                i--;
            }

        }
        return count;
    }

}
