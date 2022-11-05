package com.interview;

import java.util.ArrayList;

public class Vowel {

    static char[] vowels = {
            'a', 'e', 'i', 'o', 'u', 'y',
            'A', 'E', 'I', 'O', 'U', 'Y'
    };

    public static void main(String[] args) {
        String str = "Hll";
        System.out.println(isVowelPresent(str));
    }

    private static boolean isVowelPresent(String str) {
        ArrayList<Character> arrayList = new ArrayList<>();
        for (char c : vowels) {
            arrayList.add(c);
        }
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            boolean contains = arrayList.contains(ch);
            if (contains) return true;
        }
        return false;
    }
}
