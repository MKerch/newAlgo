package com.interview.hackerrank.basic;

public class SherlockAndSquares {

    public static void main(String[] args) {
        System.out.println(squares(24,49));
    }

    public static int squares(int a, int b) {
        // Write your code here
        int count = 0;

        for (int i = 1; i <= b; i++) {
            if (i * i >= a && i * i <= b) {
                count++;
            }
            if (i * i > b) {
                break;
            }
        }
        return count;
    }

}
