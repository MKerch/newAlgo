package com.interview;

public class TwoIndexes {

    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        System.out.println(containsNearbyDuplicate(nums, 1));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length / 2; i++) {
            for (int j = nums.length / 2; j < nums.length; j++) {
                if (nums[i] == nums[j] && Math.abs(i - j) <= k) return true;
            }
        }
        return false;
    }

}
