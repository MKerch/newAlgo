package com.interview.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverceString2 {

    public static void main(String[] args) {
        String s = "Test1ng-Leet=code-Q!";
        System.out.println(reverseOnlyLetters(s));
    }

    public static String reverseOnlyLetters2(String s) {
        StringBuilder builder = new StringBuilder(s);
        return builder.reverse().toString();
    }

    public static String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            swap(start, end, chars);
            start++;
            end--;
        }
        return Arrays.toString(chars);
    }

    private static void swap(int start, int end, char[] chars) {
//        boolean alphabetic = Character.isAlphabetic(chars[start]);
//        if (alphabetic) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
//        }
    }


}
