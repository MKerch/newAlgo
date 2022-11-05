package com.interview.hackerrank.basic;

import java.util.ArrayList;
import java.util.List;

public class Encryption {
    public static void main(String[] args) {
//        System.out.println(
//                encryption("haveaniceday")
//        );

        System.out.println(
                encryption("chillout")
        );
//        System.out.println(
//                encryption("feedthedog")
//        );

    }

    public static String encryption(String s) {
        double dRows = Math.sqrt(s.length());
        double rows = Math.floor(dRows);
        double columns = Math.ceil(dRows);

        if (rows * columns < s.length()) {
            double max = Math.max(rows, columns);
            rows = max;
            columns = max;
        }

        List<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < columns; i++) {
            list.add(new StringBuilder());
        }

        StringBuilder rest = new StringBuilder(s);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                char ch = constract(rest);
                if (ch != 0) {
                    list.get(j).append(ch);
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            result.append(list.get(i)).append(" ");
        }
        return result.toString();
    }

    private static char constract(StringBuilder rest) {
        char c = 0;
        if (rest.length() != 0) {
            c = rest.charAt(0);
            rest.delete(0, 1);
        }
        return c;
    }


}
