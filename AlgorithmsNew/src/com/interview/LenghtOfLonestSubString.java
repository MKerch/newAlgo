package com.interview;

import java.util.HashSet;
import java.util.Set;

public class LenghtOfLonestSubString {


    public static void main(String[] args) {
//        String s = "abcabcbb";
        String s = "aa";
        int result = lengthOfLongestSubstring(s);
        System.out.println(result);
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) return s.length();
        Set<Character> set = new HashSet<>();
        int maxCount = 0;
        outer:
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
            for (int j = i; j < s.length(); j++) {
                if (j != i) {
                    boolean add = set.add(s.charAt(j));
                    if (!add || j == s.length() - 1) {
                        int size = set.size();
                        if (size > maxCount) maxCount = size;
                        set.clear();
                        continue outer;
                    }
                }
            }
        }
        return maxCount;
    }

}
