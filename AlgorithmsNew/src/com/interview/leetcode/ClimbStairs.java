package com.interview.leetcode;

public class ClimbStairs {

    public static void main(String[] args) {
        //2+2/1+2+1/1+1+2/1+1+1+1/2+1+1 = 4
        //2+2+1/1+2+2/2+1+2/1+1+1+1+1/2+1+1+1/1+1+1+2/1+2+1+1/1+1+2+1 = 5
        int i = 45;
        System.out.println(climbStairs2(i));

    }

    public static int climbStairs(int n) {
        if (n < 3) return n;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static int climbStairs2(int count) {
        int num1 = 0, num2 = 1;

        for (int i = 1; i <= count; ++i) {
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
        return num2;
    }
}
