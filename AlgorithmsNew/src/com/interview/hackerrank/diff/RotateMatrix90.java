package com.interview.hackerrank.diff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateMatrix90 {

    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(Arrays.asList(1, 2, 3));
        matrix.add(Arrays.asList(4, 5, 6));
        matrix.add(Arrays.asList(7, 8, 9));
        rotate(matrix);
    }


    static void rotate(List<List<Integer>> matrix) {
        System.out.println("before = " + matrix);
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = i; j < matrix.get(i).size(); j++) {
                if (i != j) {
                    int temp = matrix.get(i).get(j);
                    matrix.get(i).set(j, matrix.get(j).get(i));
                    matrix.get(j).set(i, temp);
                }
            }
        }
        System.out.println("after = " + matrix);
    }

}
