package com.interview.leetcode.general;

public class SuperReducedString {

    public static void main(String[] args) {

//        System.out.println(superReducedString("aaabccddd"));//abd
        System.out.println(superReducedString("baab"));//abd

    }

    public static String superReducedString(String s) {
        StringBuilder result = new StringBuilder(s);
        for (int i = 0; i < result.length() - 1; i++) {
            if (result.charAt(i) == result.charAt(i + 1)) {
                result.deleteCharAt(i + 1);
                result.deleteCharAt(i);
                i = -1;
            }
        }
        String finalS = result.toString();
        return finalS.equals("") ? "Empty String" : finalS;
    }

}
