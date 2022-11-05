package com.interview.hackerrank.java;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class JavaSubarray {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int arraySize = sc.nextInt();
//        List<Integer> list = new LinkedList<>();
//        for (int i = 0; i < arraySize; i++) {
//            list.add(sc.nextInt());
//        }

        List<Integer> list = Arrays.asList(1, -2, 4, -5, 1);
        System.out.println(subArraySum(list));
    }

    private static int subArraySum(List<Integer> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j <= list.size(); j++) {
                List<Integer> subList = list.subList(i, j);
                int sum = subList.stream().mapToInt(Integer::intValue).sum();
                if (sum < 0) count++;
            }
        }
        return count;
    }


}
