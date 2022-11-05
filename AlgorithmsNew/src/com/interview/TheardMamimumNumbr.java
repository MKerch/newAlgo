package com.interview;

public class TheardMamimumNumbr {

    public static void main(String[] args) {
        int[] ar = {1,1,2};
        System.out.println(thirdMax(ar));
    }

    public static int thirdMax(int[] nums) {

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int i : nums) {
            if (i >= max1) {
                max3 = max2;
                max2 = max1;
                max1 = i;
            } else if (i >= max2) {
                max3 = max2;
                max2 = i;
            } else max3 = i;
        }
        if (max3 == 0 || nums.length==2) return Math.max(max1, max2);
        return max3;
    }

}
