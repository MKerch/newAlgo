package com.interview.hackersRank.day2;

import java.util.HashSet;

public class FindUnique {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 3, 2, 1};
        System.out.println(find(ar));
    }

    private static int find(int[] ar) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < ar.length; i++) {
            boolean add = set.add(ar[i]);
            if (!add) set.remove(ar[i]);
        }
        return set.stream().findFirst().get();
    }

}
