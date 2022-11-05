package com.interview.leetcode.general;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CommonChild {

    public static void main(String[] args) {

//        System.out.println(commonChild("HARRY", "SALLY"));
        System.out.println(commonChild("OUDFRMYMAW", "AWHYFCCMQX"));
    }

    public static int commonChild(String s1, String s2) {
        char[] charsS1 = s1.toCharArray();
        char[] charsS2 = s2.toCharArray();
        Map<Character, Integer> mapS1 = new HashMap<>();
        Map<Character, Integer> mapS2 = new HashMap<>();
        for (int i = 0; i < charsS1.length; i++) {
            if (mapS1.get(charsS1[i]) == null) {
                mapS1.put(charsS1[i], 1);
            } else mapS1.put(charsS1[i], mapS1.get(charsS1[i]) + 1);
        }

        for (int i = 0; i < charsS2.length; i++) {
            if (mapS2.get(charsS2[i]) == null) {
                mapS2.put(charsS2[i], 1);
            } else mapS2.put(charsS2[i], mapS2.get(charsS2[i]) + 1);
        }


        Set<Map.Entry<Character, Integer>> entries = mapS1.entrySet();
        int count = 0;
        for (Map.Entry<Character, Integer> e : entries) {
            if (mapS2.get(e.getKey()) != null) count++;
        }
        return count;
    }

}
