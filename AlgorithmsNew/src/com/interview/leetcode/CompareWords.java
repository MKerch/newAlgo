package com.interview.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CompareWords {


    public static void main(String[] args) {
        String name = "alex";
        String typed = "aaleex";
        System.out.println(isLongPressedName(name, typed));

    }

    public static boolean isLongPressedName(String name, String typed) {

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        loopMap(name, map1);

        loopMap(typed, map2);

        Set<Map.Entry<Character, Integer>> entries = map1.entrySet();
        for (Map.Entry<Character, Integer> map : entries) {
            Integer value = map.getValue();
            Character key = map.getKey();
            Integer i = map2.get(key);
            if (i != null && i >= value) continue;
            else return false;
        }
        return true;
    }

    static void loopMap(String typed, Map<Character, Integer> map2) {
        for (int i = 0; i < typed.length(); i++) {
            if (!map2.containsKey(typed.charAt(i))) {
                map2.put(typed.charAt(i), 1);
            } else {
                map2.put(typed.charAt(i), map2.get(typed.charAt(i)) + 1);
            }
        }
    }

}
