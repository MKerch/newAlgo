package com.interview;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {

    List<Integer> list;

    public TwoSum() {
        list = new ArrayList<>();
    }

    public void add(int number) {
        list.add(number);
    }

    public boolean find(int value) {
        return list.stream().allMatch(v -> v == value);
    }

}

