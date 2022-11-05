package com.interview.hackersRank.general;

import java.util.ArrayList;
import java.util.List;

public class RemoveAllFromArray {

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 5, 4, 7, 2};
        removeAll(array, 5);
    }

    private static int removeAll(int[] array, int target) {
        List<Integer> list = new ArrayList<>();
        for (int i : array) {
            if (i == target) list.add(i);
        }
        int j = 0;
        for (Integer i : list) {
            array[j] = i;
            j++;
        }
        return list.size();
    }

    private static void moveZeros(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i : array) {
            if (i != 0) list.add(i);
        }
        for (int i = 0; i < array.length; i++) {
            if (i < list.size()) array[i] = list.get(i);
            else array[i] = 0;
        }
    }

}
