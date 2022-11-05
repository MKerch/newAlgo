package com.interview;

import java.util.TreeSet;

public class SecondHighest {

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5, 3, 5, 6, 7, 8, 9};
        System.out.println(second(array));
    }

    private static Integer second(int[] array) {
        TreeSet<Integer> treeSet = new TreeSet();
        for (int i : array) {
            treeSet.add(i);
        }
        Integer last = treeSet.last();
        if (last != null) return treeSet.lower(last);
        else return null;
    }

}
