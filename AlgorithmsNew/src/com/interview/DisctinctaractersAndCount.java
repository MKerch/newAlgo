package com.interview;

import java.util.HashMap;
import java.util.Map;

public class DisctinctaractersAndCount {

    public static void main(String[] args) {
        String chars = "ssmmmt";
        char[] chars1 = chars.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for (char ch : chars1) {
            if (map.containsKey(ch)) map.put(ch, map.get(ch) + 1);
            else map.put(ch, 1);
        }
        System.out.println(map);
    }
}
