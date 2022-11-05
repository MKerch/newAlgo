package com.interview.hackerrank.basic;

public class RepeatedString {

    public static void main(String[] args) {
        System.out.println(repeatedString("aba", 10));
//        System.out.println(repeatedString("a", 10000));
    }

    public static long repeatedString(String s, long n) {
        // Write your code here
        int rest = (int) (n % s.length());
        String end = "";
        if (rest > 0)
            end = s.substring(0, rest);

        long countEnd = 0;
        if (!end.isEmpty())
            countEnd = end.chars().filter(v -> v == 'a').count();

        long count = s.chars().filter(v -> v == 'a').count();
        long result = n / s.length();
        return (result * count) + countEnd;
    }

//    public static long repeatedString(String s, long n) {
//        // Write your code here
//        StringBuilder builder = new StringBuilder(s);
//        while (builder.length() <= n) {
//            builder.append(s);
//        }
//        return builder.chars().filter(v -> v == 'a').count();
//    }
}
