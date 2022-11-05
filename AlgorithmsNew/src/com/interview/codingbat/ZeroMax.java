package com.interview.codingbat;

public class ZeroMax {

    public static void main(String[] args) {

        int[] ints = zeroMax(new int[]{0, 5, 0, 3});
        for (int i : ints) {
            System.out.print(i);
            System.out.print(" ");
        }
    }


    public static int[] zeroMax(int[] nums) {
        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int j = i;
                int max = 0;
                while (j < nums.length - 1) {
                    j++;
                    if (nums[j] % 2 == 1) {
                        if (max < nums[j]) max = nums[j];
                    }
                }
                array[i] = max;
            } else array[i] = nums[i];

        }
        return array;
    }

}
