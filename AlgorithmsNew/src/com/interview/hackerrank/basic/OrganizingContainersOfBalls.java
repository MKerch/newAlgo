package com.interview.hackerrank.basic;

import java.util.*;

public class OrganizingContainersOfBalls {

    public static void main(String[] args) {
//        [[1, 1], [1, 1]]
//[[0, 2], [1, 1]]

        List<List<Integer>> lists = Arrays.asList(
                Arrays.asList(1, 1),
                Arrays.asList(1, 1));

//        List<List<Integer>> lists = Arrays.asList(
//                Arrays.asList(0, 2),
//                Arrays.asList(1, 1));
        System.out.println(organizingContainers(lists));
    }

    public static String organizingContainers(List<List<Integer>> container) {
        Map<Integer, Integer> mapCount = new HashMap<>();
        for (int i = 0; i < container.size(); i++) {
            List<Integer> list = container.get(i);
            count(list, mapCount);
        }
        Optional<Integer> first = mapCount.values().stream().filter(v -> v % container.get(0).size() != 0).findFirst();
        if (first.isPresent()) return "Impossible";
        else return "Possible";
    }

    private static void count(List<Integer> list, Map<Integer, Integer> map) {
        for (int i = 0; i < list.size(); i++) {
            if (map.get(i) == null) map.put(i, list.get(i));
            else map.put(i, map.get(i) + list.get(i));
        }
    }


}
