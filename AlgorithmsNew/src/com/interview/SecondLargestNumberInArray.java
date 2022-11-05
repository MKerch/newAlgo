package com.interview;

import java.util.Arrays;

public class SecondLargestNumberInArray {

    public static void main(String[] args) {

        int[] array = {1, 55, 4, 6, 5, 7, 8, 4, 55};
        System.out.println(findSecondLargest(array));
    }

    private static int findSecondLargest(int[] array) {
        Arrays.sort(array);
        return array[array.length - 2];
    }
}
