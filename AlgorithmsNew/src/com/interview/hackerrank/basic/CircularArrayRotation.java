package com.interview.hackerrank.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CircularArrayRotation {

    public static void main(String[] args) {
        System.out.println(
                circularArrayRotation(Arrays.asList(3, 4, 5), 2, Arrays.asList(1, 2)));
    }

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        int[] arr = new int[a.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[(i + k) % arr.length] = a.get(i);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < queries.size(); i++) {
            result.add(arr[queries.get(i)]);
        }
        return result;
    }
}
