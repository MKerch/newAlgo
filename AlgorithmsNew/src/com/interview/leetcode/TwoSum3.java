package com.interview.leetcode;

import java.util.HashSet;
import java.util.Iterator;

public class TwoSum3 {

    private HashSet<Integer> set;

    public TwoSum3() {
        set = new HashSet<>();
    }

    public void add(int number) {
        set.add(number);
    }

    public boolean find(int value) {
        if (set.size() < 2) return false;
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            Integer second = (Integer) value - next;
            boolean contains = set.contains(second);
            if (contains && second.hashCode() != next) return true;
        }
        return false;
    }

    public static void main(String[] args) {

        TwoSum3 sum3 = new TwoSum3();
        sum3.add(3);
        sum3.add(2);
        sum3.add(1);
        System.out.println(sum3.find(3));
    }
}
