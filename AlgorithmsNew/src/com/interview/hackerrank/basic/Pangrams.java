package com.interview.hackerrank.basic;

import java.util.HashSet;
import java.util.Set;

public class Pangrams {

    public static void main(String[] args) {

//        System.out.println(pangrams("We promptly judged antique ivory buckles for the next prize"));
        System.out.println(pangrams("We promptly judged antique ivory buckles for the prize"));

    }

    public static String pangrams(String s) {
        Set<Character> set = new HashSet<>();
        String s1 = s.replaceAll(" ", "").toLowerCase();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            set.add(ch);
        }
        return set.size() == 26 ? "pangram" : "not pangram";
    }

}
