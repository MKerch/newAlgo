package com.interview;

import java.util.HashSet;

public class DuplicateCharacters {

    public static void main(String[] args) {
        String s = "jsndjsdnvksksksvlnv";
        HashSet<Character> set = getDuplicates(s);
        System.out.println(set);
    }

    private static HashSet<Character> getDuplicates(String s) {
        HashSet<Character> duplicates = new HashSet<>();
        HashSet<Character> unique = new HashSet<>();
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            boolean add = duplicates.add(ch);
            if (!add) unique.add(ch);
        }
        return unique;
    }

}
