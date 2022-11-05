package com.interview.leetcode.general;

public class PalindromeIndex {

    public static void main(String[] args) {

        System.out.println(palindromeIndex("aaab"));

    }

    public static int palindromeIndex(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            StringBuilder start = new StringBuilder(sb.substring(0, i));
            StringBuilder end = new StringBuilder(sb.substring(i + 1));
            StringBuilder cropped = start.append(end);
            if (cropped.toString().equals(cropped.reverse().toString())) {
                return i;
            }
        }
        return -1;
    }


    public static int palindromeIndex2(String s) {
        int indexStart = 0;
        int indexEnd = s.length() - 1;
        int result = -1;
        while (indexEnd < indexStart) {



        }

        return result;
    }
}
