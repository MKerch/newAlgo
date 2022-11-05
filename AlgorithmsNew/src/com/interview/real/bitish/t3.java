package com.interview.real.bitish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class t3 {

    static List<Integer> result = new ArrayList<>();

    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "712",
                "246",
                "365",
                "312");
        System.out.println(slotWheels2(list));
    }

    public static int slotWheels2(List<String> history) {
        if (history.get(0).length() == 0) return result.stream().mapToInt(Integer::intValue).sum();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < history.size(); i++) {
            int val = history.get(i).chars().map(Character::getNumericValue).max().getAsInt();
            if (val > max) max = val;
        }
        result.add(max);
        List<String> builder = removeMax(history);
        return slotWheels2(builder);
    }

    private static List<String> removeMax(List<String> history) {
        List<String> list = new ArrayList<>();
        for (String s : history) {
            int max = Integer.MIN_VALUE;
            int index = -1;
            for (int i = 0; i < s.length(); i++) {
                int numericValue = Character.getNumericValue(s.charAt(i));
                if (numericValue > max) {
                    max = numericValue;
                    index = i;
                }
            }
            StringBuilder stringBuilder = new StringBuilder(s).deleteCharAt(index);
            list.add(stringBuilder.toString());
        }
        return list;
    }
}


