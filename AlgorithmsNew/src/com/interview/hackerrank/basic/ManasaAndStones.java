package com.interview.hackerrank.basic;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ManasaAndStones {


    public static void main(String[] args) {

    }

    public static List<Integer> stones(int n, int a, int b) {
//        Set<Integer> result = new LinkedHashSet<>();
        List<Integer> list = new ArrayList<>();
        int max = b * n;
        int min = a * n;
        int sum = b + a;
        list.add(max);
        list.add(min);
        list.add(sum);
        return list;
    }

}
