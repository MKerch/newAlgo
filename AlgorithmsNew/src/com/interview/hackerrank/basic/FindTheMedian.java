package com.interview.hackerrank.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTheMedian {

    public static void main(String[] args) {

        System.out.println(findMedian(Arrays.asList(0, 1, 2, 4, 6, 5, 3)));
    }

    public static int findMedian(List<Integer> arr) {
        Collections.sort(arr);
        return arr.get(arr.size() / 2);
    }

}
