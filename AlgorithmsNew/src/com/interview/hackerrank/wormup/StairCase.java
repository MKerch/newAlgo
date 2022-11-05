package com.interview.hackerrank.wormup;

public class StairCase {

    public static void main(String[] args) {
        staircase(6);
    }

    public static void staircase(int n) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i++) s.append(' ');
        for (int i = n; i > 0; i--) {
            s.setCharAt(i - 1, '#');
            System.out.println(s);
        }
    }
}
