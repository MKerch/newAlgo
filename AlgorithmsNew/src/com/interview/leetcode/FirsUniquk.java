package com.interview.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirsUniquk {

    public static void main(String[] args) {
        String s = "loveleetcode";//return index 2
        System.out.println(firstNonRepitanle(s));
    }

    private static int firstNonRepitanle(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.toCharArray().length; i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else map.put(s.charAt(i), 1);
        }

        for (Map.Entry<Character, Integer> set : map.entrySet()) {
            if (set.getValue() == 1) return s.indexOf(set.getKey());
        }
        return -1;
    }

}
