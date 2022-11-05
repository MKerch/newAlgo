package com.interview.hackerrank.basic;

import java.util.ArrayList;
import java.util.List;

public class FunnyString {

    public static void main(String[] args) {

    }


    public static String funnyString(String s) {
        // Write your code here
        String builder = new StringBuilder(s).reverse().toString();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < s.length() - 1; i++) {
            int v = s.charAt(i);
            int v2 = s.charAt(i + 1);
            list1.add(Math.abs(v - v2));

            int f = builder.charAt(i);
            int f2 = builder.charAt(i + 1);
            list2.add(Math.abs(f - f2));
        }
        return list1.equals(list2) ? "Funny" : "Not Funny";

    }
}
