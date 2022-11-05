package com.interview;

import java.util.ArrayList;
import java.util.Optional;

public class ListOnlyOdd {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(5);
        list.add(11);
        System.out.println(isOnlyOdd(list));
    }

    private static boolean isOnlyOdd(ArrayList<Integer> list) {
        Optional<Integer> first = list.stream()
                .filter(v -> v % 2 == 0)
                .findFirst();
        return !first.isPresent();
    }


}
