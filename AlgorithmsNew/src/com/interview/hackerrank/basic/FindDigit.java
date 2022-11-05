package com.interview.hackerrank.basic;

public class FindDigit {

    public static void main(String[] args) {
//        System.out.println(findDigits(124));
        System.out.println(findDigits(1012));
    }

    public static int findDigits(int n) {
        String s = String.valueOf(n);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int numericValue = Character.getNumericValue(s.charAt(i));
            if (numericValue == 0) continue;
            if (n % numericValue == 0) count++;
        }
        return count;
    }

}
