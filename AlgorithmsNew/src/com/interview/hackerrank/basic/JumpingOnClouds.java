package com.interview.hackerrank.basic;

import java.util.Arrays;
import java.util.List;

public class JumpingOnClouds {
    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(
                Arrays.asList(0, 0, 1, 0, 0, 1, 0)));
    }

    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < c.size()-1; i++) {
            if (c.get(i) == 0) {
                i++;
                count++;
            }
        }
        return count;


    }

}
