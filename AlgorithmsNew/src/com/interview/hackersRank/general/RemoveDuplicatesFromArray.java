package com.interview.hackersRank.general;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {
        int[] array = {1, 1, 2};
        int updatedLength = removeDuplicates(array);
    }

    private static int removeDuplicates(int[] array) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        Iterator<Integer> iterator = set.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            array[i] = iterator.next();
            i++;
        }
        return set.size();
    }

}
