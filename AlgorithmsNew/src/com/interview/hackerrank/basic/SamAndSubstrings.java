package com.interview.hackerrank.basic;

public class SamAndSubstrings {

    //todo
    public static void main(String[] args) {
//        System.out.println(substrings("42"));
        System.out.println(substrings("123"));
    }

    public static int substrings(String n) {
        int sum = Integer.parseInt(n);
        for (int i = 0; i < n.length(); i++) {
            int numericValue = Character.getNumericValue(n.charAt(i));
            sum += numericValue;
        }
        return sum;
    }

}
