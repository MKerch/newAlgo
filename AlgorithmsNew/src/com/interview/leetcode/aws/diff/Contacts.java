package com.interview.leetcode.aws.diff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Contacts {

    //I make it, again time limit
    public static void main(String[] args) {
        List<List<String>> queries = Arrays.asList(
                Arrays.asList("add", "hack"),
                Arrays.asList("add", "hackerrank"),
                Arrays.asList("find", "hac"),
                Arrays.asList("find", "hak")
        );
        List<Integer> contacts = contacts(queries);
        System.out.println(contacts);
    }

    public static List<Integer> contacts(List<List<String>> queries) {
        List<Integer> result = new ArrayList<>();
        List<String> repo = new ArrayList<>();
        for (int i = 0; i < queries.size(); i++) {
            List<String> strings = queries.get(i);
            String queryName = strings.get(0);
            String word = strings.get(1);
            if (queryName.equals("add")) repo.add(word);
            else if (queryName.equals("find")) {
                int count = 0;
                for (String s : repo) {
                    if (s.startsWith(word)) count++;
                }
                result.add(count);
            }
        }
        return result;
    }

}
