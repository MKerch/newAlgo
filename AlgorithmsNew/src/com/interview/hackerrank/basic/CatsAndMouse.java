package com.interview.hackerrank.basic;

public class CatsAndMouse {

    public static void main(String[] args) {
        System.out.println(catAndMouse(1, 2, 3));
    }

    private static String catAndMouse(int x, int y, int z) {
        int fist = Math.abs(z - x);
        int second = Math.abs(z - y);
        if (fist < second) return "Cat A";
        else if (fist > second) return "Cat B";
        else return "Mouse C";
    }

}
