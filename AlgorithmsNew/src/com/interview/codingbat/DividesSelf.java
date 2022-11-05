package com.interview.codingbat;

public class DividesSelf {

    public static void main(String[] args) {

        System.out.println(dividesSelf(120));

    }

    public static boolean dividesSelf(int n) {
        String s = String.valueOf(n);
        for (int i = s.length()-1; i >= 0; i--) {
            int numericValue = Character.getNumericValue(s.charAt(i));
            if (numericValue==0 || n % numericValue != 0) return false;
        }
        return true;
    }

}
