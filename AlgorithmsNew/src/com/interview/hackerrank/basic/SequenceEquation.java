package com.interview.hackerrank.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SequenceEquation {

    public static void main(String[] args) {
        System.out.println(
                permutationEquation(Arrays.asList(5, 2, 1, 3, 4)));
    }

    public static List<Integer> permutationEquation(List<Integer> p) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= p.size(); i++) {
            int index = p.indexOf(i)+1;
            int index2 = p.indexOf(index)+1;
            result.add(index2);
        }
        return result;

    }


}
