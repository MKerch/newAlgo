package com.interview.hackerrank.basic;

import java.util.ArrayList;
import java.util.List;

public class CutTheSticks {

    private static List<Integer> result = new ArrayList<>();


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        cutTheSticks(list);
    }

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        if (arr.size() == 0) return result;
        else result.add(arr.size());

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            int current = arr.get(i);
            if (current < min) {
                min = current;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            Integer current = arr.get(i);
            if(current!=min) list.add(arr.get(i)- min);
        }
        return cutTheSticks(list);
    }

}
