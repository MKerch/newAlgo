package com.interview.hackerrank.basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EqualizeTheArray {


    public static void main(String[] args) {
        System.out.println(
                equalizeArray(Arrays.asList(3, 3, 2, 1, 3)));
    }

    public static int equalizeArray(List<Integer> arr) {
        // Write your code here
        Map<Integer, Integer> map = new HashMap<>();
        int maxCount = 1;
        for (int i = 0; i < arr.size(); i++) {
            Integer current = map.get(arr.get(i));
            if (current == null) {
                map.put(arr.get(i), 1);
            } else {
                int val = current+1;
                map.put(arr.get(i), val);
                if (val > maxCount) maxCount = val;
            }
        }
        return arr.size() - maxCount;
    }

}
