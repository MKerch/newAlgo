package com.interview;

public class IndexOfValue {

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 6};
        System.out.println(index(array, 5));
    }

    private static int index(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) return i;
            else if (array[i] > target) return i;
        }
        return array.length;
    }

}
