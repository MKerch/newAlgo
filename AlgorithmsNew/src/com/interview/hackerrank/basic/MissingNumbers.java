package com.interview.hackerrank.basic;

import java.util.*;

public class MissingNumbers {

    public static void main(String[] args) {


    }

//    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
//        Collections.sort(arr);
//        Collections.sort(brr);
//        List<Integer> result = new ArrayList<>();
//        if (arr.size() == brr.size()) return result;
//
//        Set<Integer> set = new LinkedHashSet<>();
//        for (int i = 0, j = 0; i < brr.size(); i++) {
//            if (!brr.get(i).equals(arr.get(j))) {
//                set.add(brr.get(i));
//            } else {
//                j++;
//            }
//        }
//        result.addAll(set);
//        return result;
//    }

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < brr.size(); i++) {
            if (map.get(brr.get(i)) == null) {
                map.put(brr.get(i), 1);
            } else {
                map.put(brr.get(i), map.get(brr.get(i)) + 1);
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            if (map.get(arr.get(i)) != null) {
                int val = map.get(arr.get(i)) - 1;
                if (val == 0) map.remove(arr.get(i));
                else map.put(arr.get(i), val);
            }
        }
        List<Integer> result = new ArrayList<>();
        result.addAll(map.keySet());
        Collections.sort(result);
        return result;
    }

}
