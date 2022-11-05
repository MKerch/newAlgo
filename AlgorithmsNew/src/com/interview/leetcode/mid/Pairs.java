package com.interview.leetcode.mid;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pairs {

    public static void main(String[] args) {

    }

    public static int pairs(int k, List<Integer> arr) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                if (Math.abs(arr.get(i) - arr.get(j)) == k) count++;
            }
        }
        return count;
    }

    public static int pairs2(int k, List<Integer> arr) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.contains(arr.get(i) + k)) count++;
        }
        return count;
    }

    //it is correct
    public static int pairs3(int k, List<Integer> arr) {
        Set<Integer> set = new HashSet<>(arr);
        int count = 0;
        for (int i : set) {
            if (set.contains(i + k)) count++;
        }
        return count;
    }
}
