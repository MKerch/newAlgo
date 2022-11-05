package com.interview.hackerrank.basic;

import java.util.Arrays;
import java.util.List;

public class AngryProfessor {

    public static void main(String[] args) {
        System.out.println(angryProfessor(3, Arrays.asList(-2, -1, 0, 1, 2)));
    }

    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here
        int inTime = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) <= 0) inTime++;
        }
        if (k <= inTime) return "NO";
        else return "YES";
    }

}
