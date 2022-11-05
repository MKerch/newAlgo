package com.interview.hackerrank.basic;

public class AlternatingCharacters {

    static int count = 0;

    public static void main(String[] args) {
//        System.out.println(alternatingCharacters("AAABBBAABB"));
//        System.out.println(alternatingCharacters("AABBAABB"));
//        System.out.println(alternatingCharacters("AAABBB"));
        System.out.println(alternatingCharacters("AABBAABB"));
    }

//    public static int alternatingCharacters(String s) {
//        String sA = s.replaceAll("AA", "A");
//        String sB = sA.replaceAll("BB", "B");
//        if (s.contains("AA") || s.contains("BB")) {
//            count += s.length() - sB.length();
//            alternatingCharacters(sB);
//        }
//        return count;
//    }

    public static int alternatingCharacters(String s) {
        String result = s;
        while (result.contains("AA") || result.contains("BB")) {
            String a = result.replaceAll("AA", "A");
            String b = a.replaceAll("BB", "B");
            result = b;
        }
        return s.length() - result.length();
    }

}
