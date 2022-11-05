package com.interview.hackerrank.basic;

import java.util.*;

public class ClimbingTheLeaderboard {

    public static void main(String[] args) {

        List<Integer> integers = climbingLeaderboard(Arrays.asList(100, 90, 90, 80, 75, 60), Arrays.asList(50, 65, 77, 90, 102));
        System.out.println(integers);

    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < player.size(); i++) {
            int id = add(ranked, player.get(i));
            result.add(id);
        }
        return result;
    }

    private static int add(List<Integer> ranked, Integer player) {
        TreeSet<Integer> set =  new TreeSet<>(ranked);
        set.add(player);
        Iterator<Integer> iterator = set.descendingIterator();
        int count = 0;
        while (iterator.hasNext()){
            count++;
            Integer next = iterator.next();
            if(Objects.equals(next, player)) break;
        }
        return count;
    }

}
