package com.interview.hackerrank.basic;

public class UtopianTree {

    public static void main(String[] args) {
        System.out.println(utopianTree(6));
    }

    public static int utopianTree(int n) {
        if (n == 0) return 1;
        int length = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) length += 1;
            else length *= 2;
        }
        return length;
    }


}
