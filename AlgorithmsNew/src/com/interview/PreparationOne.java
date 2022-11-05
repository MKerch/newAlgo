package com.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PreparationOne {


    public static void main(String[] args) {
        int[] array = {8, 1, 2, 2, 3};
        int[] result = conpute(array);
        System.out.println(Arrays.toString(result));
    }

    private static int[] conpute(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] > array[j]) {
                    boolean b = map.containsKey(array[i]);
                    if (!b) map.put(array[i], 1);
                    else map.put(array[i], map.get(array[i]) + 1);
                }
            }
        }
        int[] result = new int[map.size()];
        int i = 0;
        for (Map.Entry<Integer, Integer> set : map.entrySet()) {
            result[i] = set.getValue();
            i++;
        }
        return result;

    }
}
