package com.interview;

public class StringRemoveWhiteSpace {

    public static void main(String[] args) {
        String s = "  aa d   v   w";
        System.out.println(removeWhiteSpaces(s));
    }

    private static String removeWhiteSpaces(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.toCharArray().length; i++) {
            if (s.charAt(i) != ' ')
                stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }
}
