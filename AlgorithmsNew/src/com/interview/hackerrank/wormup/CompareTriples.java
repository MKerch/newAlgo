package com.interview.hackerrank.wormup;

import java.util.*;

public class CompareTriples {


    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(1, 2, 3);
        List<Integer> b = Arrays.asList(3, 2, 1);

        System.out.println(compareTriplets(a, b));

    }


    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                map.merge("Alise", 1, Integer::sum);
            } else if (a.get(i) < b.get(i)) {
                map.merge("Bob", 1, Integer::sum);
            }
        }
        List<Integer> list = new ArrayList<>();
        list.add(map.get("Alise"));
        list.add(map.get("Bob"));
        return list;
    }
}
