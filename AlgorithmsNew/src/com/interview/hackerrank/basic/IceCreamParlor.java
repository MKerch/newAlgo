package com.interview.hackerrank.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IceCreamParlor {

    public static void main(String[] args) {

        System.out.println(icecreamParlor(6, Arrays.asList(1, 3, 4, 5, 6)));

    }

    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == m) {
                    indexes.add(i+1);
                    indexes.add(j+1);
                }
            }
        }
        return indexes;
    }

}
