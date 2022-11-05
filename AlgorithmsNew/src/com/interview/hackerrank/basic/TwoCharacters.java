package com.interview.hackerrank.basic;

import java.util.HashSet;
import java.util.Set;

public class TwoCharacters {

    public static void main(String[] args) {
//        System.out.println(alternate("beabeefeab"));
        System.out.println(alternate("asdcbsdcagfsdbgdfanfghbsfdab"));
    }

    public static int alternate(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        Character[] characters = set.toArray(new Character[0]);
        if(set.size()==s.length()&&set.size()>1) return s.length();
        int count = 0;
        for (int i = 0; i < characters.length - 1 - 2; i++) {
            for (int j = i + 1; j < characters.length - 2; j++) {
                String s1 = s.replaceAll("[^" + characters[i].toString() + characters[j].toString() + "]", "");
                int i1 = checkLogic(s1);
                if (i1 > count) count = i1;
            }
        }
        return count;
    }

    private static int checkLogic(String s2) {
        for (int i = 0; i < s2.length() - 1; i++) {
            if (s2.charAt(i) == s2.charAt(i + 1)) return 0;
        }
        return s2.length();
    }

}
