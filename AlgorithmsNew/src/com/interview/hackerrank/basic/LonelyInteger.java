package com.interview.hackerrank.basic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyInteger {

    public static void main(String[] args) {

    }

    public static int lonelyinteger(List<Integer> a) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.size(); i++) {
            if (map.get(a.get(i)) == null) {
                map.put(a.get(i), 1);
            } else map.put(a.get(i), map.get(a.get(i)) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (value == 1) return key;
        }
        return -1;
    }

}
