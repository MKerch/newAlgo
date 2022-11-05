package com.interview.real.stakelogic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String s = "java scala ruby kafka kafka ruby";
        Map<String, Integer> map = compute2(s);
        System.out.println(map);
    }

    private static Map<String, Integer> compute(String s) {
        String[] array = s.split(" ");
        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (result.get(array[i]) == null) result.put(array[i], 1);
            else result.put(array[i], result.get(array[i]) + 1);
        }
        return result;
    }

    private static Map<String, Integer> compute2(String s) {
        String[] array = s.split(" ");
        Map<String, Integer> result = new HashMap<>();
        Arrays.stream(array).forEach(v -> result.merge(v, 1, Integer::sum));
        return result;
    }

}
