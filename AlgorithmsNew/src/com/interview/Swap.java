package com.interview;

public class Swap {

    static int a = 20;
    static int b = 10;

    public static void main(String[] args) {
//        System.out.println("a before swap= " + a);
//        System.out.println("b before swap= " + b);
//        swap(a, b);
//        System.out.println("a after swap= " + a);
//        System.out.println("b after swap= " + b);

        int a = 10;
        int b = 20;
        swapNumbers(a, b);

    }

    private static void swap(int a, int b) {
        a = b + a;
        Swap.b = a - b;
        Swap.a = a - Swap.b;
    }

    public static void swapNumbers(int a, int b) {
        b = b + a;
        a = b - a;
        b = b - a;
        System.out.printf("a is %d, b is %d", a, b);
    }


}
