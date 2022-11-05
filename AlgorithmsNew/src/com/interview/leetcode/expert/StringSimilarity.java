package com.interview.leetcode.expert;

public class StringSimilarity {

    public static void main(String[] args) {

        System.out.println(stringSimilarity("ababaa"));

    }

    public static int stringSimilarity(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            String substring = s.substring(i);
            int charsCount = countChars(s, substring);
            if (charsCount != 0) count += charsCount;
        }
        return count;
    }

//    private static int countChars(String s, String substring) {
//        int count = 0;
//        if (s.charAt(0) != substring.charAt(0)) return 0;
//        else {
//            int i = 0;
//            while (i < substring.length() && s.charAt(i) == substring.charAt(i) ) {
//                count++;
//                i++;
//            }
//        }
//        return count;
//    }

    private static int countChars(String s, String substring) {
        int count = 0;
        if (s.charAt(0) != substring.charAt(0)) return count;
        else {
            int i = substring.length();
            while (i >= 0 && !s.startsWith(substring.substring(0, i))) {
                i--;
                if(i==0) return count;
            }
            count += substring.substring(0, i).length();
        }
        return count;
    }
}
