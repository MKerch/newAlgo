package com.interview.hackerrank.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CavityMap {

    public static void main(String[] args) {
        System.out.println(cavityMap(Arrays.asList("1892", "1111", "1111", "1111")));
    }

    public static List<String> cavityMap(List<String> grid) {
        List<String> newList = new ArrayList<>();
        int length = grid.get(0).length();
        int midIndex = (length / 2);
        boolean isMod = (length % 2) == 0;
        for (int i = 0; i < grid.size(); i++) {
            String current = grid.get(i);
            int first = Character.getNumericValue(current.charAt(0));
            int last = Character.getNumericValue(current.charAt(current.length() - 1));
            if (isMod) {
                boolean isBigger = Character.getNumericValue(current.charAt(midIndex)) < Character.getNumericValue(current.charAt(midIndex - 1));
                if (isBigger) midIndex -= 1;
            }
            int midInt = Character.getNumericValue(current.charAt(midIndex));
            if (first < midInt && last < midInt) {
                StringBuilder builder = new StringBuilder(current);
                builder.setCharAt(midIndex, 'X');
                current = builder.toString();
            }
            newList.add(i, current);
        }
        return newList;
    }


}
