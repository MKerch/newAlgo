package com.interview.hackerrank.basic;

import java.util.HashSet;

public class TwoStrings {

    public static void main(String[] args) {
        System.out.println(twoStrings("", ""));
    }

    public static String twoStrings(String s1, String s2) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            set.add(String.valueOf(s1.charAt(i)));


        }
        for (int i = 0; i < s2.length(); i++) {
            boolean contains = set.contains(String.valueOf(s2.charAt(i)));
            if(contains){
                return "Yes";
            }
        }
        return "NO";
    }

}
