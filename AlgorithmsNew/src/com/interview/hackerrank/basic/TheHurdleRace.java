package com.interview.hackerrank.basic;

import java.util.List;

public class TheHurdleRace {

    public static void main(String[] args) {

    }

    public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < height.size(); i++) {
            if (height.get(i) > max) max = height.get(i);
        }
        return max > k ? max-k : 0;
    }

}
