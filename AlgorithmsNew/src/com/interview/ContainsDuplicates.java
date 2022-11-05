package com.interview;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {


    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 1};
        System.out.println(containsDuplicate(ar));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            boolean add = set.add(i);
            if (!add) return true;
        }
        return false;
    }


}
