package com.interview;

public class BinarySearch {

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch(sortedArray, 0, sortedArray.length, 5));
    }

    private static int binarySearch(int[] sortedArray, int start, int end, int key) {
        int mid = (start + end) / 2;

        while (start <= end) {
            if (sortedArray[mid] < key) {
                start = mid + 1;
            } else if (sortedArray[mid] > key) {
                end = mid - 1;
            } else return mid;
            mid = (start + end) / 2;
        }
        return -1;
    }


}
