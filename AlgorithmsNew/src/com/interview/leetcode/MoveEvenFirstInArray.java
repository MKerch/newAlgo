package com.interview.leetcode;

import java.util.Arrays;

public class MoveEvenFirstInArray {

    public static void main(String[] args) {
        int[] array = {3, 1, 2, 4};
        int[] ints = sortArrayByParity(array);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] sortArrayByParity(int[] nums) {
        int firstOdd = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) firstOdd = i;
            else continue;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
                if (nums[j] % 2 == 0) {
                    if (firstOdd < j) swap(j, firstOdd, nums);
                }
            }
        }
        return nums;
    }

    private static void swap(int lastEven, int firstOdd, int[] nums) {
        int temp = nums[firstOdd];
        nums[firstOdd] = nums[lastEven];
        nums[lastEven] = temp;
    }

}
