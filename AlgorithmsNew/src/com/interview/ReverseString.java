package com.interview;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(reverse(str));
    }

    private static String reverse(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }

}
