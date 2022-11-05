package com.interview.hackerrank.wormup;

import java.util.List;

public class PrintDiagonalMatrix {


    public static void main(String args[]) {
        int a[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {1, 2, 3, 4},
                {5, 6, 7, 8}};

//        printPrincipalDiagonal(a);
//        printSecondaryDiagonal(a);
    }

//    private static void printPrincipalDiagonal(int[][] mat) {
//        System.out.print("PrincipalDiagonal: ");
//        for (int i = 0; i < mat.length; i++) {
//            for (int j = 0; j < mat.length; j++) {
//                if (i == j) System.out.print(mat[i][j] + ", ");
//            }
//        }
//        System.out.println("");
//    }
//
//    private static void printSecondaryDiagonal(int[][] mat) {
//        System.out.print("SecondaryDiagonal: ");
//        for (int i = 0; i < mat.length; i++) {
//            for (int j = 0; j < mat.length; j++) {
//                if ((i + j) == (mat.length - 1)) System.out.print(mat[i][j] + ", ");
//            }
//        }
//        System.out.println("");
//    }

    private static int printPrincipalDiagonal(List<List<Integer>> mat) {
        int sum = 0;
        for (int i = 0; i < mat.size(); i++) {
            for (int j = 0; j < mat.size(); j++) {
                if (i == j) sum += mat.get(i).get(j);
            }
        }
        return sum;
    }

    private static int printSecondaryDiagonal(List<List<Integer>> mat) {
        int sum = 0;
        for (int i = 0; i < mat.size(); i++) {
            for (int j = 0; j < mat.size(); j++) {
                if ((i + j) == (mat.size() - 1)) sum += mat.get(i).get(j);
            }
        }
        return sum;
    }
}
