package com.interview.hackerrank.basic;

import java.util.Collections;
import java.util.List;

public class BetweenTwoSeats {


    public static int getTotalX(List<Integer> a, List<Integer> b) {
        Collections.sort(a);
        Collections.sort(b);
        int min = a.get(0);
        int max = b.get(b.size() - 1);
        int count = 0;
        for (int i = min; i <= max; i++) {
            if (hasFactors(i, a) && isFactor(i, b)) count++;
        }
        return count;
    }

    public static boolean hasFactors(int num, List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (num % arr.get(i) != 0) return false;
        }
        return true;
    }

    public static boolean isFactor(int num, List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % num != 0) return false;
        }
        return true;
    }

}
