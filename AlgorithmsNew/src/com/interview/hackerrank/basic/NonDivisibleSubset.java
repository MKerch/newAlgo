package com.interview.hackerrank.basic;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class NonDivisibleSubset {

    public static void main(String[] args) {
        System.out.println(nonDivisibleSubset(3, Arrays.asList(1, 7, 2, 4)));
    }

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        // Write your code here
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < s.size(); i++) {
            for (int j = i + 1; j < s.size(); j++) {
                if ((s.get(i) + s.get(j)) % k != 0) {
                    set.add(s.get(i));
                    //set.add(s.get(j));
                }
            }
        }
        return set.size();
    }

}
