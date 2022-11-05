package com.interview.leetcode;

public class IndexOfValue {

    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 0, 1, 2};
        int target = 6;
//        System.out.println(indexOf(array, target));
        System.out.println(ifExist(array, target));
    }

    private static int indexOf(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) return i;
        }
        return -1;
    }

    private static boolean ifExist(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) return true;
        }
        return false;
    }

}
