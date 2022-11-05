package com.interview.hackerrank.basic;

import java.util.*;

public class Gemstones {

    public static void main(String[] args) {
        System.out.println(gemstones(Arrays.asList("abcdde", "baccd", "eeabg")));
    }

    public static int gemstones(List<String> arr) {

        List<Set<Character>> sets = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            Set<Character> set = new HashSet<>();
            String current = arr.get(i);
            for (int j = 0; j < current.length(); j++) {
                set.add(current.charAt(j));
            }
            sets.add(set);
        }

        Set<Character> characters = sets.get(0);
        Iterator<Character> iterator = characters.iterator();
        int count = 0;
        outer: while (iterator.hasNext()) {
            Character ch = iterator.next();
            for (int i = 0; i < sets.size(); i++) {
                Set<Character> set = sets.get(i);
                boolean contains = set.contains(ch);
                if (!contains) continue outer;
            }
            count++;
        }
        return count;
    }

}
