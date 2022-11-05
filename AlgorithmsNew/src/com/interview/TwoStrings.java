package com.interview;

import java.util.HashSet;
import java.util.Set;

public class TwoStrings {

    public static void main(String[] args) {
//        Input: s = "foo", t = "bar"
        String one = "bbbaaaba";//""egg";
        String two = "aaabbbba";//"add";
        System.out.println(isIsomorphic(one, two));

    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        Set<Character> set = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        for (int i = 0, j = 0; i < s.length() && j < t.length(); i++, j++) {
            if (s.charAt(i) == s.charAt(j)) return false;

            boolean add = set.add(s.charAt(i));
            if (!add) sb.append(1);
            else sb.append(0);

            boolean add2 = set2.add(t.charAt(j));
            if (!add2) sb2.append(1);
            else sb2.append(0);
        }
        return sb.toString().equals(sb2.toString());
    }

}
