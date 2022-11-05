package com.interview;

public class SwapNumbers {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);
    }

    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + " | " + "b = " + b);
    }

}
