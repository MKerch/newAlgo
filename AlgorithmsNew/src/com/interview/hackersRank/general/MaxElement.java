package com.interview.hackersRank.general;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxElement {

    public static void main(String[] args) {
//        List<Integer> integers = Arrays.asList(2, 2, 1, 1, 1, 2, 2);
//        int[] integers = {2, 2, 1, 1, 1, 2, 2, 3, 3, 3, 3, 3};
//        int[] integers = {3, 2, 2, 2, 3};
        int[] integers = {10, 100, 101, 101};
        System.out.println(maxElement(integers, 101));
//        int result = maxElement(integers);
//        List<Integer> result = maxElement2(integers);
//        result.forEach(System.out::println);
    }

    private static List<Integer> maxElement2(int[] integers) {
        int times = integers.length / 3;
        Map<Integer, Integer> mapCount = new HashMap<>();
        for (int i : integers) {
            if (!mapCount.containsKey(i)) mapCount.put(i, 1);
            else mapCount.put(i, mapCount.get(i) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> set : mapCount.entrySet()) {
            Integer key = set.getKey();
            Integer value = set.getValue();
            if (value > times) list.add(key);

        }
        return list;
    }

    private static int maxElement(int[] integers) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxValue = 0;
        int maxKey = 0;
        for (int i : integers) {
            if (!map.containsKey(i)) map.put(i, 1);
            else map.put(i, map.get(i) + 1);
            if (map.get(i) > maxValue) {
                maxValue = map.get(i);
                maxKey = i;
            }
        }
        return maxKey;
    }

    private static boolean maxElement(int[] integers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxValue = 0;
        int maxKey = 0;
        for (int i : integers) {
            if (!map.containsKey(i)) map.put(i, 1);
            else map.put(i, map.get(i) + 1);
            if (map.get(i) > maxValue) {
                maxValue = map.get(i);
                maxKey = i;
            }
        }
        return maxKey == target && maxValue > integers.length / 2;
    }
}


