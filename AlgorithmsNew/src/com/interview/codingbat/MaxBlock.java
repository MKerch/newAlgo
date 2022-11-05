package com.interview.codingbat;

public class MaxBlock {


    public static void main(String[] args) {

        System.out.println(maxBlock("abbCCCddBBBxx"));

    }

    public static int maxBlock(String str) {
        if (str.isEmpty()) return 0;
        int max = Integer.MIN_VALUE;
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
                if (count > max) max = count;
            } else count = 1;
        }
        return max == Integer.MIN_VALUE ? 1 : max;
    }
}
