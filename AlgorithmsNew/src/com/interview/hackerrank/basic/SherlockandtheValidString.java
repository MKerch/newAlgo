package com.interview.hackerrank.basic;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SherlockandtheValidString {
    public static void main(String[] args) {
//        System.out.println(isValid("abcdefghhgfedecba"));
//        System.out.println(isValid("abbac"));
        System.out.println(isValid("aaaabbcc"));
//        System.out.println(isValid("abcdefghhgfedecba"));
    }

    public static String isValid(String s) {
        if (s.length() == 1) return "YES";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (!map.containsKey(current)) {
                map.put(current, 1);
            } else {
                int updatedValue = map.get(current) + 1;
                map.put(current, updatedValue);
            }
        }
        Double evg = Math.ceil((double) s.length()/map.size());
        int avgInt = evg.intValue();
        int count = 0;
        Collection<Integer> values = map.values();
        for (Integer i : values) {
            if (avgInt > i && i - 1 == 0) count++;
            else if (avgInt < i && i - 1 == avgInt) count++;

        }
        if (count == 0 || count == 1) return "YES";
        else return "NO";
    }

}
