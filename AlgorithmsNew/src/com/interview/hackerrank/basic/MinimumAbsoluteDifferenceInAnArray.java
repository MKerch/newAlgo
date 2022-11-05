package com.interview.hackerrank.basic;

import java.util.Collections;
import java.util.List;

public class MinimumAbsoluteDifferenceInAnArray {

    public static void main(String[] args) {

    }

    public static int minimumAbsoluteDifference(List<Integer> arr) {
        int min = Integer.MAX_VALUE;
        Collections.sort(arr);
        for (int i = 0; i < arr.size() - 1; i++) {
            int currentAbs = Math.abs(arr.get(i) - arr.get(i + 1));
            if (currentAbs < min) min = currentAbs;
        }
        return min;
    }

}
