package com.interview.hackerrank.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ACMICPCTeam {

    public static void main(String[] args) {

        System.out.println(acmTeam(Arrays.asList("10101", "11100", "11010", "00101")));

    }

    public static List<Integer> acmTeam(List<String> topic) {
        int maxTopics = Integer.MIN_VALUE;
        int teamsCount = 0;

        for (int i = 0; i < topic.size(); i++) {
            String current = topic.get(i);
            for (int j = i + 1; j < topic.size(); j++) {
                String next = topic.get(j);
                int count = compare(current, next);
                if (count > maxTopics) {
                    maxTopics = count;
                    teamsCount = 1;
                } else if (count == maxTopics) teamsCount++;
            }
        }
        List<Integer> list = new ArrayList<>();
        list.add(maxTopics);
        list.add(teamsCount);
        return list;
    }

    private static int compare(String current, String next) {
        int count = 0;
        for (int i = 0; i < current.length(); i++) {
            int valueCur = Character.getNumericValue(current.charAt(i));
            int valueNext = Character.getNumericValue(next.charAt(i));
            if (valueCur == 0 && valueNext == 1
                    || valueCur == 1 && valueNext == 0
                    || valueCur == 1 && valueNext == 1) {
                count++;
            }
        }
        return count;
    }

}
