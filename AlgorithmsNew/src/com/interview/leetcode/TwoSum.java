package com.interview.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] ar = {2, 7, 11, 15};
        int[] ints = twoSum(ar, 18);
        System.out.println(Arrays.toString(ints));


    }


    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();//value and index
        for (int i = 0; i < nums.length; i++) {
            Integer index = map.get(nums[i]);
            if (index != null) return new int[]{index, i};
            else map.put(target - nums[i],
                    i);//I put second value which we need to find next and index id
        }
        return nums;
    }
}
