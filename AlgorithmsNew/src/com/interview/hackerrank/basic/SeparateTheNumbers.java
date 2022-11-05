package com.interview.hackerrank.basic;

import java.util.Scanner;

public class SeparateTheNumbers {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = 0;
            for (int j = 0; j < n; j++) {
                int currentValue = (int) (Math.pow(2, j) * b);
                if (j == 0) currentValue = a + (int) (Math.pow(2, j) * b);
                sum += currentValue;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
