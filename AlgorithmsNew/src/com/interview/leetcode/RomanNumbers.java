package com.interview.leetcode;

public class RomanNumbers {

//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000


//    I can be placed before V (5) and X (10) to make 4 and 9.
//    X can be placed before L (50) and C (100) to make 40 and 90.
//    C can be placed before D (500) and M (1000) to make 400 and 900.

    public static void main(String[] args) {


//        String s = "LVIII";//58
        String s = "MCMXCIV";//2216
        int i = convert(s);
        System.out.println(i);
    }

    private static int convert(String s) {

        char[] chars = s.toCharArray();
        int sum = 0;
        for (char ch : chars) {
            switch (ch) {
                case 'I': sum+=1;
                break;
                case 'V': sum+=5;
                    break;
                case 'X': sum+=10;
                    break;
                case 'L': sum+=50;
                    break;
                case 'C': sum+=100;
                    break;
                case 'D': sum+=500;
                    break;
                case 'M': sum+=1000;
                    break;
            }
        }
        return sum;
    }
}
