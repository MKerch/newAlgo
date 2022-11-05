package com.interview.leetcode;


public class GetLarWordLength {

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        int result = getLengthOfS(s);
        System.out.println(result);
    }

    private static int getLengthOfS(String s) {
        String[] array = s.split(" ");
        for (int i = array.length-1; i >= 0; i--) {
            if (!array[i].equals(" ")) return array[i].length();
        }
        return s.length();
    }
}
