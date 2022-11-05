package com.interview.hackerrank.java;

public class JavaSubstringComparisons {

    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("welcometojava", 3));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = "";

        for (int i = 0; i <= s.length() - k; i++) {
            String substring = s.substring(i, i + k);
            if (smallest.compareTo(substring) > 0) smallest = substring;
            if(largest.compareTo(substring) < 0) largest = substring;
        }

        return smallest + "\n" + largest;
    }

}
