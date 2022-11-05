package com.interview.hackersRank.day1;

import java.util.Arrays;
import java.util.List;

public class PlusMinus {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(-4, 3, -9, 0, 4, 1);
        calculate(arr);
    }

    private static void calculate(List<Integer> arr) {
        double sumPositive = 0;
        double sumNegative = 0;
        double sum0 = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 0) {
                sum0++;
            } else if (arr.get(i) > 0) {
                sumPositive++;
            } else sumNegative++;
        }
        double resultP = sumPositive/arr.size();
        double resultN = sumNegative/arr.size();
        double result0 = sum0/arr.size();
        System.out.println(resultP);
        System.out.println(resultN);
        System.out.println(result0);
    }

}
