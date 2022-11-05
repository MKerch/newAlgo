package com.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashMapSortByValue {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Me", 1);
        map.put("Me2", 5);
        map.put("M3", 3);
        map.put("Dad", 4);
        map.put("She", 2);
        SortedSet<Map.Entry<String, Integer>> entries = entriesSortedByValues(map);
        System.out.println(entries);
    }

    static <K, V extends Comparable<? super V>> SortedSet<Map.Entry<K, V>> entriesSortedByValues(Map<K, V> map) {
        SortedSet<Map.Entry<K, V>> sortedEntries = new TreeSet<>(
                (e1, e2) -> {
                    int res = e1.getValue().compareTo(e2.getValue());
                    return res != 0 ? res : 1;
                }
        );
        sortedEntries.addAll(map.entrySet());
        return sortedEntries;
    }
}
