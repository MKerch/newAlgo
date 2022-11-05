package com.interview.hackerrank.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClosestNumbers {

    public static void main(String[] args) {
        System.out.println(closestNumbers(Arrays.asList(-5, 15, 25, 71, 63)));
    }

    public static List<Integer> closestNumbers(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        Collections.sort(arr);
        for (int i = 0; i < arr.size()-1; i++) {
            int currentFirst = arr.get(i);
            int currentSecond = arr.get(i + 1);
            int currentAbs = Math.abs(currentFirst - currentSecond);
            if (currentAbs < min) {
                result.clear();
                min = currentAbs;
                result.add(currentFirst);
                result.add(currentSecond);
            } else if (currentAbs == min) {
                result.add(currentSecond);
                result.add(currentFirst);
            }
        }
        Collections.sort(result);
        return result;
    }

}
