package com.interview;

import java.util.HashMap;

public class WorldsCount {

    public static void main(String[] args) {
        String s = "thjrekek";
        System.out.println(count(s));
    }

    private static HashMap<Character, Integer> count(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            map.computeIfPresent(ch, (key, value) -> value + 1);
            map.putIfAbsent(ch, 1);
        }
        return map;
    }

}
