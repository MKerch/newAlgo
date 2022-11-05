package com.interview.hackerrank.basic;

public class StrangeCounter {

    public static void main(String[] args) {
//        System.out.println(strangeCounter(1000000000000l));
        System.out.println(strangeCounter(4));
    }

//    public static long strangeCounter(long t) {
//        // Write your code here
//        long j = 3l;
//        long current = 3l;
//        for (long i = 1; i<=t; i++) {
//            if (i == t) return j;
//            if (j == 1) {
//                j = current *= 2;
//                continue;
//            }
//            j -= 1;
//        }
//        return -1;
//    }

    public static long strangeCounter(long t) {
        // Write your code here
        long j = 3l;
        long current = 3l;
        for (long i = 1; i<=t; j++) {
            if (i == t) return j;
            if (j == 1) {
                j = current *= 2;
                continue;
            }
            j -= 1;
        }
        return -1;
    }

}
