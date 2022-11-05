package com.interview.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ArrayWords {

    public static void main(String[] args) {
        String[] array = {"h", "i", " ", "n", "a",
                "m", "e", " ", "m", "y", " ", "i", "s"};
        List<String> result = rearenge(array);
        //System.out.println(Arrays.toString(result));
        System.out.println(result.get(0)+" "+result.get(2)+" "+result.get(1)+" "+result.get(3));
    }

    private static List<String> rearenge(String[] array) {
        List<String> list = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(" ")) {
                stringBuilder.append(array[i]);
                if (i == array.length - 1) list.add(stringBuilder.toString());
            } else {
                list.add(stringBuilder.toString());
                stringBuilder.setLength(0);
                continue;
            }
        }
        return list;
    }
}
