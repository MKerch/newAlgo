package com.interview.leetcode;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String first = "anagram";
        String second = "nagaram";
        System.out.println(ana(first, second));
    }

    private static boolean ana(String first, String second) {
        if (first.length() != second.length()) return false;
        char[] chars1 = first.toCharArray();
        char[] chars2 = second.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        for (int i = 0; i < chars1.length; i++) {
            stringBuilder1.append(chars1[i]);
            stringBuilder2.append(chars2[i]);
        }
        return stringBuilder1.toString().equals(stringBuilder2.toString());
    }
}
