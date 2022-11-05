package com.interview.leetcode;

public class FirstIndex {

    public static void main(String[] args) {
        String haystack = "aaaaa", needle = "bba";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
