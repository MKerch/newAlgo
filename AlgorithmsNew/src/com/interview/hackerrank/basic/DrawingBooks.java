package com.interview.hackerrank.basic;

public class DrawingBooks {

    public static void main(String[] args) {
//        System.out.println(pageCount(6, 5));
//        System.out.println(pageCount(6, 2));
//        System.out.println(pageCount(5, 4));
        System.out.println(pageCount(4, 4));
    }

    public static int pageCount(int n, int p) {
        // Write your code here
        int totalPageTurnCountFromFront = n / 2;
        int targetPageTurnCountFromFront = p / 2;
        int targetPageTurnCountFromBack = totalPageTurnCountFromFront - targetPageTurnCountFromFront;
        return Math.min(targetPageTurnCountFromFront, targetPageTurnCountFromBack);
    }

}
