package com.interview.leetcode;

public class removeElementsFromArray {

    public static void main(String[] args) {

        int[] array = {3, 2, 2, 3};
        int ints = removeAll(array, 3);
        System.out.println(ints);
//        System.out.println(Arrays.toString(array));
    }

    private static int removeAll(int[] array, int val) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == val) {
                array[i] = 0;
                count++;
            }
        }
        return array.length - count;
    }

    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}