package com.interview.hackerrank.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(73, 67, 38, 33);
        System.out.println(gradingStudents(list));
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < grades.size(); i++) {
            int rounded = update(grades.get(i));
            result.add(rounded);
        }
        return result;
    }

    private static int update(Integer i) {
        if (i <= 37) return i;
        int computed = 5 - (i % 5);
        if (computed < 3) return i + computed;
        else return i;
    }

}
