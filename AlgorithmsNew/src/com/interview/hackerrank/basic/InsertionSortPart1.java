package com.interview.hackerrank.basic;

import java.util.Arrays;
import java.util.List;

public class InsertionSortPart1 {

    public static void main(String[] args) {
        insertionSort1(5, Arrays.asList(2, 4, 6, 8, 3));
    }

    public static void insertionSort1(int n, List<Integer> arr) {
        for (int i = 1; i < n; ++i) {
            int key = arr.get(i);
            int j = i - 1;
            while (j >= 0 && arr.get(j) > key) {
                arr.set(j + 1, arr.get(j));
                j = j - 1;
                print(arr);
            }
            arr.set(j + 1, key);
        }
        print(arr);
    }

    private static void print(List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
            System.out.print(" ");
        }
        System.out.println();
    }


}
