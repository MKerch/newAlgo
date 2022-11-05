package com.interview.hackerrank.wormup;

import java.util.*;

public class PlusMinus {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 1, 0, -1, -1);
        plusMinus(arr);
    }

    public static void plusMinus(List<Integer> arr) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("P", 0);
        map.put("N", 0);
        map.put("Z", 0);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 0) {
                map.merge("Z", 1, Integer::sum);
            } else if (arr.get(i) > 0) {
                map.merge("P", 1, Integer::sum);
            } else {
                map.merge("N", 1, Integer::sum);
            }
        }
        Collection<Integer> values = map.values();
        for (Integer v : values) {
            double d = (double) v / arr.size();
            System.out.printf("%.6f%n", d);
        }
    }

}
