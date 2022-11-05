package com.interview.hackerrank.java;

import java.util.ArrayDeque;
import java.util.Deque;


public class JavaDequeue {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        int n = 6;
        int m = 3;

        int[] array = new int[]{5, 3, 5, 2, 3, 2};

        int count = 1;
        int max = 0;
        outer: for (int i = 0; i < n; i++) {
            for (int j = i; j < m + 1; j++) {
                boolean contains = deque.contains(array[i]);
                if (!contains) count++;
                else {
                    count = 0;
                    deque.clear();
                    continue outer;
                }
                deque.add(array[i]);
                if (max < count) max = count;
            }
        }
        System.out.println(max);

    }


}
