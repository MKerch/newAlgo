package com.interview.real.bitish;

import java.util.*;

public class t2 {


    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(5, 4, 4, 3, 2);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> integers = frequencyOfMaxValue(list1, list2);
        System.out.println(integers);

    }

    public static List<Integer> frequencyOfMaxValue(List<Integer> numbers, List<Integer> q) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < q.size(); i++) {
            for (int j = i; j < q.size(); j++) {
                Integer num = numbers.get(j);
                if (!map.containsKey(num)) map.put(num, 1);
                else map.put(num, map.get(num) + 1);
                if (num > max) max = num;
            }
            result.add(map.get(max));
            map.clear();
            max = Integer.MIN_VALUE;
        }
        return result;
    }
}
