package com.interview.leetcode;

public class ReverceStringByK {

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseStr(s, k));

    }

    public static String reverseStr(String s, int k) {
        StringBuilder builder = new StringBuilder();
        if (s.length() < k) return builder.append(s).reverse().toString();
        for (int i = 0; i < s.length() - 1; i += k + k) {
            builder.append(s.charAt(i + 1)).append(s.charAt(i));
        }
        return builder.toString();
    }


}
