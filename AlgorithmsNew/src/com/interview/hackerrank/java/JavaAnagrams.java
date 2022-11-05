package com.interview.hackerrank.java;

public class JavaAnagrams {

    public static void main(String[] args) {

    }

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        java.util.Map<Character, Integer> map = new java.util.HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            if (map.get(a.charAt(i)) == null) map.put(a.charAt(i), 1);
            else map.put(a.charAt(i), map.get(a.charAt(i)) + 1);
        }

        for (int i = 0; i < b.length(); i++) {
            Integer value = map.get(b.charAt(i));
            if (value != null) {
                value--;
                if (value == 0) map.remove(b.charAt(i));
                else map.put(b.charAt(i), value);
            } else return false;
        }
        return map.size() == 0;
    }


}
