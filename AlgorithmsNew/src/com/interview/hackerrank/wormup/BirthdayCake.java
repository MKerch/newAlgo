package com.interview.hackerrank.wormup;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BirthdayCake {

    public static void main(String[] args) {

        System.out.println(birthdayCakeCandles(Arrays.asList(4, 4, 1, 3)));

    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candles.size(); i++) {
            Integer current = candles.get(i);
            if (max < current) max = current;
            map.merge(current, 1, Integer::sum);
        }
        return map.get(max);
    }

}
