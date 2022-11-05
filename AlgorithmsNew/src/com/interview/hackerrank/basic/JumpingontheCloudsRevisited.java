package com.interview.hackerrank.basic;

public class JumpingontheCloudsRevisited {

    public static void main(String[] args) {
        System.out.println(
//                jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 1, 0}, 2));
                jumpingOnClouds(new int[]{1, 1, 1, 0, 1, 1, 0, 0, 0, 0}, 3));//80
    }

    static int jumpingOnClouds(int[] c, int k) {
        int count = 100;
        for (int i = 0; i < c.length; i += k) {
            if (c[i] == 1) {
                count = count - 1 - 2;
            } else count -= 1;
        }
        return count;
    }
}
