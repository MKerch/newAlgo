package com.interview.hackerrank.mid;

import java.util.ArrayList;
import java.util.List;

public class AbsolutePermutation {


    //todo didnt solved
    public static void main(String[] args) {

        System.out.println(absolutePermutation(2, 1));

    }

    public static List<Integer> absolutePermutation(int n, int k) {
        int[] pos = new int[n];
        for (int i = 1; i <= n; i++) {
            pos[i - 1] = i;
        }
        swap(pos, k);
        List<Integer> result = new ArrayList<>();
//        int min = Integer.MAX_VALUE;
        for (int i = 0; i < pos.length; i++) {
            int current = Math.abs(pos[i] - i);
            if (current != k) {
                result.add(-1);
                return result;
            }
            result.add(current);
        }
        return result;
    }

    private static void swap(int[] pos, int k) {
        for (int i = 0; i < pos.length/2; i++) {
                int temp = pos[i];
                pos[i] = pos[i + k];
                pos[i + k] = temp;
        }
    }

}
