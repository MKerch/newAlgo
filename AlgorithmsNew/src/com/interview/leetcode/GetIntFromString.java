package com.interview.leetcode;

public class GetIntFromString {
    public static void main(String[] args) {
        String s = "words and 987";
        int result = getInt(s);
        System.out.println(result);
    }

    private static int getInt(String s) {
        String trim = s.trim();
        String[] array = trim.split(" ");
        for (String sr : array) {
            try {
                int i = Integer.parseInt(sr);
                return i;
            } catch (NumberFormatException e) {
//                continue;
            }
        }
        return -1;
    }

}
