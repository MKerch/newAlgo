package com.interview.leetcode;

public class Polindrom {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalidrom(s));
    }

    private static boolean isPalidrom(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(cleaned);
        return cleaned.equals(stringBuilder.reverse().toString());
    }

}
