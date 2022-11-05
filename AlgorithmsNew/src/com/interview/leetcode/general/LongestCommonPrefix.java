package com.interview.leetcode.general;

public class LongestCommonPrefix {

    public static void main(String[] args) {

//        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
//        System.out.println(longestCommonPrefix(new String[]{"flower", "flower", "flower", "flower"}));
        System.out.println(longestCommonPrefix(new String[]{"ab", "a"}));

    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs[0].length() == 0 || strs.length == 1) return strs[0];
        String initial = strs[0];
        String sub = "";
        for (int i = 0; i <= initial.length(); i++) {
            sub = initial.substring(0, i);
            for (int j = 0; j < strs.length; j++) {
                if (!strs[j].startsWith(sub)) {
                    return sub.substring(0, sub.length() - 1);
                }
            }
        }
        return sub.isEmpty() ? sub : initial;
    }
}
