package com.interview.leetcode;

public class ComonPrefix {

    public static void main(String[] args) {
        String[] array = {"a"};
        String s = common(array);
        System.out.println(s);
    }

    private static String common(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }
}
