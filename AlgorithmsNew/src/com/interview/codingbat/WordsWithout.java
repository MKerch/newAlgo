package com.interview.codingbat;

import java.util.ArrayList;
import java.util.List;

public class WordsWithout {


    public String[] wordsWithout(String[] words, String target) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                list.add(words[i]);
            }
        }
        return list.toArray(new String[0]);
    }
}
