package com.interview.leetcode;

public class WhenToBuyStock {

    public static void main(String[] args) {
//        int[] array = {7, 1, 5, 3, 6, 4};
//        int[] array = {7,6,4,3,1};
        int[] array = {2,4,1};
        int result = whenToBuy(array);
        System.out.println(result);
    }

    private static int whenToBuy(int[] array) {
        int min = Integer.MAX_VALUE;
        int minIndex = 0;//index
        int max = Integer.MIN_VALUE; //index
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                minIndex = i;
            }
        }

        for (int j = minIndex; j < array.length; j++) {
            if (max < array[j]) max = array[j];
        }
        return max - min;
    }

}
