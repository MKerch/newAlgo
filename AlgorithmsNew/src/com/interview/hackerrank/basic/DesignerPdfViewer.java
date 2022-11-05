package com.interview.hackerrank.basic;

import java.util.Arrays;
import java.util.List;

public class DesignerPdfViewer {

    public static void main(String[] args) {

    }

    public static int designerPdfViewer(List<Integer> h, String word) {
        // Write your code here
        List<Character> list = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < word.length(); i++) {
            int j = list.indexOf(word.charAt(i));
            Integer val = h.get(j);
            if (val > max) max = val;
        }
        return word.length() * 1 * max;
    }

}
