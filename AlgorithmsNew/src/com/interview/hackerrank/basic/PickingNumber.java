package com.interview.hackerrank.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PickingNumber {

    public static void main(String[] args) {

//        System.out.println(pickingNumbers(Arrays.asList(4, 2, 3, 4, 4, 9, 98, 98, 3, 3, 3, 4, 2, 98, 1, 98, 98, 1, 1, 4, 98, 2, 98, 3, 9, 9, 3, 1, 4, 1, 98, 9, 9, 2, 9, 4, 2, 2, 9, 98, 4, 98, 1, 3, 4, 9, 1, 98, 98, 4, 2, 3, 98, 98, 1, 99, 9, 98, 98, 3, 98, 98, 4, 98, 2, 98, 4, 2, 1, 1, 9, 2, 4)));
        System.out.println(pickingNumbers(Arrays.asList(1, 2, 2, 3, 1, 2)));
//        System.out.println(pickingNumbers(Arrays.asList(98, 3, 99, 1, 97, 2)));
//        System.out.println(pickingNumbers(Arrays.asList(4, 6, 5, 3, 3, 1)));
//        System.out.println(pickingNumbers(Arrays.asList(1, 1, 2, 2, 4, 4, 5, 5, 5)));
    }


    public static int pickingNumbers(List<Integer> a) {
        Collections.sort(a);
        int count = 1;
        int max = 1;
        int min = a.get(0);
        for (int i = 0; i < a.size() - 1; i++) {
            int val1 = a.get(i);
            int val2 = a.get(i + 1);
            int currentMin = Math.min(val1, val2);
            int currentMax = Math.max(val1, val2);
            int currentAbs = Math.abs(currentMax - min);
            if (currentMin < min) min = currentMin;
            int abs = Math.abs(val1 - val2);
            if (abs <= 1 && currentAbs <= 1) {
                count++;
                if (count > max) max = count;
            } else {
                min = currentMax;
                count = 1;
            }
        }
        return max;
    }


//    public static int pickingNumbers(List<Integer> a) {
//        // Write your code here
//        Collections.sort(a);
//        int maxCount = Integer.MIN_VALUE;
//        List<Integer> result = new ArrayList<>();
//        for (int i = 0; i < a.size() - 1; i++) {
//            if (a.get(i + 1) - a.get(i) > 1) {
//                result.add(a.get(i));
//                if (maxCount < result.size()) maxCount = result.size();
//                result.clear();
//            } else {
//                result.add(a.get(i));
//                if (i == a.size() - 2) {
//                    result.add(a.get(i + 1));
//                    if (maxCount < result.size()) maxCount = result.size();
//                }
//            }
//        }
//        return maxCount;
//    }

}
