package com.interview.Test;

public class ManTwo {

    static String s = "0";

    public static void main(String[] args) {
        updateS(s);
        System.out.println(s);
    }

    private static void updateS(String s1) {
        s = "1";
    }

}
