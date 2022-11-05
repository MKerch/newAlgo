package com.interview.leetcode.general;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterInString {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }

    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == null) map.put(s.charAt(i), 1);
            else map.remove(s.charAt(i));
        }
//        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
//        for (Map.Entry<Character, Integer> e : entries) {
//            if (e.getValue() == 1) return s.indexOf(e.getKey());
//        }
        Character character = map.keySet().toArray(new Character[0])[0];
        return character != null ? s.indexOf(character) : 0;
    }


}
