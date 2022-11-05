package com.interview.hackerrank.basic;

public class NumberLineJump {

    public static void main(String[] args) { //2564 5393 5121 2836
        System.out.println(kangaroo(2564, 5393, 5121, 2836));
    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        if (x2 > x1 && v2 > v1) return "NO";
        int res1 = x1 + v1;
        int res2 = x2 + v2;
        boolean isFirst = res1 > res2;
        while (true) {
            if (res1 == res2) return "YES";
            if (isFirst && res2 > res1) return "NO";
            if (!isFirst && res1 > res2) return "NO";
            res1 = res1 + v1;
            res2 = res2 + v2;
            System.out.println(res1 + " " + res2);
        }
    }

}
