package com.interview;

public class Polindrom {

    public static void main(String[] args) {
        String str = "moom";
        System.out.println(isPolindrom(str));
    }

    private static boolean isPolindrom(String str) {
        if (str == null) return false;
        StringBuilder stringBuilder = new StringBuilder(str).reverse();
        return str.equals(stringBuilder.toString());
    }
}
