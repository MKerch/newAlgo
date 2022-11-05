package com.interview.hackerrank.basic;

public class ChocolateFeast {

    public static void main(String[] args) {
        System.out.println(chocolateFeast(15, 3, 2));
    }

    public static int chocolateFeast(int n, int c, int m) {
        int initialAmount = n / c;
        int countResult = initialAmount;
        while (initialAmount >= m) {
            int current = initialAmount / m;
            countResult += current;
            initialAmount = (initialAmount % m) + current;
        }
        return countResult;
    }

}
