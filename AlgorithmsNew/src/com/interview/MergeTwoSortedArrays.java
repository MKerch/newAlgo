package com.interview;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = {0};
        int[] nums2 = {1};
        merge(nums1, 0, nums2, 1);
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = nums1.length - 1, j = 1; i >= 0; i--, j++) {
            if (nums1[i] == 0 && i >= m) {
                nums1[i] = nums2[nums2.length - j];
            } else if (nums1[i] == 0 && i == m) {
                nums1[i] = nums2[nums2.length - j];
            }
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

}
