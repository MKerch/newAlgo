package com.interview.hackerrank.basic;

public class SuperReducedString {

    public static void main(String[] args) {

//        System.out.println(superReducedString("baab"));
        System.out.println(superReducedString("aaabccddd"));

    }

    public static String superReducedString(String s) {
        StringBuilder builder = new StringBuilder(s);
        boolean isFound = false;
        for (int i = 0; i < builder.length() - 1; i++) {
            if (builder.charAt(i) == builder.charAt(i + 1)) {
                builder.deleteCharAt(i + 1);
                builder.deleteCharAt(i);
                isFound = true;
                i--;
            }
        }
        if (isFound) return superReducedString(builder.toString());
        if(builder.toString().isEmpty()) return "Empty String";
        return builder.toString();
    }

}
