package com.interview.hackerrank.basic;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AppleAndOrange {

    public static void main(String[] args) {

    }

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("A", 0);
        map.put("O", 0);
        for (int i = 0; i < apples.size(); i++) {
            int howFar = apples.get(i) + a;
            if (howFar >= s && howFar <= t) map.put("A", map.get("A") + 1);
        }

        for (int i = 0; i < oranges.size(); i++) {
            int howFar = oranges.get(i) + b;
            if (howFar >= s && howFar <= t) map.put("O", map.get("O") + 1);
        }
        map.values().forEach(System.out::println);
    }

}
