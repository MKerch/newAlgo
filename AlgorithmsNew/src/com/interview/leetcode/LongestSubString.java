package com.interview.leetcode;

import java.util.LinkedHashSet;

public class LongestSubString {

    public static void main(String[] args) {
//        String s = "pwwkew";
        String s = "dvdf";
        System.out.println(check(s));
    }

    public static int check(String s) {
        LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<>();
        int result = s.length();
        for (int i = 0; i < s.length(); i++) {
            boolean add = linkedHashSet.add(s.charAt(i));
            if (!add) {
                i = s.charAt(i) + 1;
                result = linkedHashSet.size();
                linkedHashSet.clear();
            }
            result = linkedHashSet.size();
        }
        return result;
    }

}
