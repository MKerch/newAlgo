package com.interview.hackerrank.basic;

import java.util.ArrayList;
import java.util.List;

public class HackerRankinaString {

    public static void main(String[] args) {
//        System.out.println(hackerrankInString("haacckkerannk"));
        System.out.println(hackerrankInString("rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt"));
    }

    public static String hackerrankInString(String s) {
        List<Character> list = addToListChars();
        for (int i = 0; i < s.length(); i++) {
            Character current = s.charAt(i);
            if (list.indexOf(current) == 0)
                list.remove(current);
        }
        return list.size() > 0 ? "NO" : "YES";
    }

    private static List<Character> addToListChars() {
        List<Character> list = new ArrayList<>();
        list.add('h');
        list.add('a');
        list.add('c');
        list.add('k');
        list.add('e');
        list.add('r');
        list.add('r');
        list.add('a');
        list.add('n');
        list.add('k');
        return list;
    }

}
