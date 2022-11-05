package com.interview.hackerrank.basic;

import java.util.*;

public class WeightedUniformStrings {

    public static final Map<Character, Integer> map = new HashMap<>();

    static {
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);
        map.put('d', 4);
        map.put('e', 5);
        map.put('f', 6);
        map.put('g', 7);
        map.put('h', 8);
        map.put('i', 9);
        map.put('j', 10);
        map.put('k', 11);
        map.put('l', 12);
        map.put('m', 13);
        map.put('n', 14);
        map.put('o', 15);
        map.put('p', 16);
        map.put('q', 17);
        map.put('r', 18);
        map.put('s', 19);
        map.put('t', 20);
        map.put('u', 21);
        map.put('v', 22);
        map.put('w', 23);
        map.put('x', 24);
        map.put('y', 25);
        map.put('z', 26);
    }

    public static void main(String[] args) {

//        weightedUniformStrings("abbcccdddd", Arrays.asList(1, 7, 5, 4, 15));
        System.out.print(weightedUniformStrings("abccddde", Arrays.asList(1, 3, 12, 5, 9, 10)));

    }

    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {

        Set<Integer> waights = new HashSet<>();
        int count = 0;
        boolean firstTime = false;
        for (int i = 0; i < s.length(); i++) {
            Integer value = map.get(s.charAt(i));
            if (i > 0 && s.charAt(i - 1) == s.charAt(i)) {
                if (!firstTime) {
                    count = value + value;
                    firstTime = true;
                } else count += value;
                waights.add(count);
            } else {
                waights.add(value);
                count = 0;
                firstTime = false;
            }
        }

        List<String> results = new ArrayList<>();
        for (int i = 0; i < queries.size(); i++) {
            if (waights.contains(queries.get(i))) results.add("Yes");
            else results.add("No");
        }
        return results;
    }

}
