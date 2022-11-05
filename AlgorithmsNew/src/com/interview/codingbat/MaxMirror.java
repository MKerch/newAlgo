package com.interview.codingbat;

public class MaxMirror {

    public static void main(String[] args) {
        System.out.println(maxMirror(new int[]{1, 2, 3, 8, 9, 3, 2, 1}));
    }

    public static int maxMirror(int[] nums) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        int currentJ = nums.length - 1;
        outer:for (int i = 0; i < nums.length; i++) {
            for (int j = currentJ; j > 0; j--) {
                if (nums[i] == nums[j]) {
                    currentJ--;
                    count++;
                    if (count > max) max = count;
                    continue outer;
                }else{
                    count = 0;
                }
            }
        }
        return max;
    }

}
