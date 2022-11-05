package com.interview.hackerrank.basic;

public class ViralAdvertising {

    public static void main(String[] args) {
        System.out.println(viralAdvertising(3));
    }

    public static int viralAdvertising(int n) {
        // Write your code here

        int count = 0;
        int comulativeCount = 0;
        for (int i = 0; i < n; i++) {

            if (i == 0) {
                count += 5 / 2;
                comulativeCount = count;
            } else {
                count = (count % 2) + (count / 2) * 3;
                comulativeCount += count;
            }
        }
        return comulativeCount;
    }

}
