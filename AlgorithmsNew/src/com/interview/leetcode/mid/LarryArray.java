package com.interview.leetcode.mid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LarryArray {

    public static void main(String[] args) {

        System.out.println(larrysArray(Arrays.asList(1, 6, 5, 2, 4, 3)));

    }

    public static String larrysArray(List<Integer> ar) {
        for (int i = 1; i < ar.size() - 3; i++) {
            int j = i + 3;
            List<Integer> list = ar.subList(i, j);
            List<Integer> rotatedList = rotate(list);
            List<Integer> updated = updateOld(rotatedList, ar, i, j);
        }
        List<Integer> result = new ArrayList<>(ar);
        Collections.sort(result);
        if (ar.equals(result)) return "YES";
        else return "NO";
    }

    private static List<Integer> updateOld(List<Integer> rotatedList, List<Integer> ar, int i, int j) {
        List<Integer> result = new ArrayList<>(ar);
        for (int a = i, k = 0; a < j; a++, k++) {
            result.add(i, rotatedList.get(k));
        }
        return result;
    }

    private static List<Integer> rotate(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        result.add(list.get(2));
        result.add(list.get(0));
        result.add(list.get(1));
        return result;
    }

}
