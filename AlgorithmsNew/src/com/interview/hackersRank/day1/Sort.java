package com.interview.hackersRank.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0, 1, 2, 4, 3);
        System.out.println(mid(list));
    }

    private static int mid(List<Integer> list) {
        Collections.sort(list);
        int mid = 0;
        if (list.size() % 2 == 0) {
            mid = (list.size() / 2);
        } else {
            mid = list.size() / 2;
        }
        return mid;
    }
}
