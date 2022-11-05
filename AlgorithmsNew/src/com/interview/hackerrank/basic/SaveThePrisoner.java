package com.interview.hackerrank.basic;

public class SaveThePrisoner {

    public static void main(String[] args) {
        System.out.println(saveThePrisoner(4, 6, 2));
//        System.out.println(saveThePrisoner(7, 19, 2));
//        System.out.println(saveThePrisoner(3, 7, 3));
//        System.out.println(saveThePrisoner(5, 2, 2));
    }

    public static int saveThePrisoner(int n, int m, int s) {
        int poisoned = (s + m - 1) % n;
        if (poisoned == 0) poisoned = n;
        return poisoned;
    }

    //correct time limit error
//    public static int saveThePrisoner(int n, int m, int s) {
//        // Write your code here
//
//        for (int i = s; i <= n; i++) {
//            m--;
//            if (m == 0) return i;
//            if (i == n) {
//                i = 0;
//                continue;
//            }
//        }
//        return -1;
//    }

}
