package com.interview.leetcode;

public class IncrementByOneArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3};
        int[] array2 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
//        int[] result = increment(array2);
//        System.out.println(Arrays.toString(result));
        System.out.println(Integer.MAX_VALUE);
    }


    private static int[] increment(int[] array) {
        String resultS = "";
        for (int i : array) {
            resultS += i;
        }
        int result = Integer.parseInt(resultS) + 1;
        String value = String.valueOf(result);

        int[] resultArray = new int[value.length()];
        for (int i = 0; i < value.length(); i++) {
            int end = result % 10;
            resultArray[value.length() - 1 - i] = end;
            result = (result - end) / 10;
        }
        return resultArray;
    }

}
