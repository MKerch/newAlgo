package com.interview.hackerrank.java;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class JavaBigDecimal {

    public static void main(String[] args) {

        String[] array = new String[]{"-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34",
                "000.000"};
        String[] s = sort(array);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }

    private static String[] sort(String[] s) {
        Arrays.sort(s, Collections.reverseOrder(Comparator.comparing(BigDecimal::new)));
        return s;
    }

}
