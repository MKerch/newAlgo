package com.interview.hackersRank.day2;

import java.util.Arrays;
import java.util.List;

public class MatrixDiagonalDifference {

    public static void main(String[] args) {
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {9, 8, 9}
//        };

        List<List<Integer>> matrix = Arrays.asList(
                Arrays.asList(11, 2, 4),
                Arrays.asList(4, 5, 6),
                Arrays.asList(10, 8, -12)
        );
        System.out.println(getDiff(matrix));
    }

    private static int getDiff(List<List<Integer>> matrix) {
        int firstDiagSum = matrix.get(0).get(0) + matrix.get(1).get(1) + matrix.get(2).get(2);
        int secondDiagSum = matrix.get(0).get(2) + matrix.get(1).get(1) + matrix.get(2).get(0);
        return secondDiagSum-firstDiagSum;

    }
}
