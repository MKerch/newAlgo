package com.interview.hackerrank.basic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MigrationBirds {

    public static void main(String[] args) {

    }

    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 0);
        map.put(2, 0);
        map.put(3, 0);
        map.put(4, 0);
        map.put(5, 0);
        int maxCount = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            Integer k = arr.get(i);
            Integer v = map.get(k);
            if (v == null) map.put(k, 1);
            else {
                int modified = v + 1;
                map.put(k, modified);
                if (modified > maxCount) maxCount = modified;
            }
        }
        int minResult = Integer.MAX_VALUE;
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> set : entries) {
            if (set.getValue() == maxCount) {
                if (set.getKey() < minResult) minResult = set.getKey();
            }
        }
        return minResult;
    }

}
