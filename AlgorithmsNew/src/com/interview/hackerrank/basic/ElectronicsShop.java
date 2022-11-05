package com.interview.hackerrank.basic;

public class ElectronicsShop {

    public static void main(String[] args) {

    }

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int maxSum = -1;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                int currentSum = keyboards[i] + drives[j];
                if (keyboards[i] + drives[j] <= b) {
                    if (maxSum <= currentSum && currentSum <= b) {
                        maxSum = currentSum;
                    }
                }
            }
        }
        return maxSum;
    }
}
