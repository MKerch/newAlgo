package com.workOnErrors;

import java.util.Arrays;

public class DataArt {

    public static void main(String[] args) {
        String s = "CDCABBDABC"; //CD, AB, CB
        compute(s);
    }

    private static void compute(String s) {
        if (!isPresent(s)) {
            System.out.println(s);
            return;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (ifContain(s.charAt(i), s.charAt(i + 1))) {
                String update = delete(i, i + 1, s);
                if (isPresent(update)) compute(update);
                else {
                    System.out.println(update);
                    break;
                }
            }
        }
    }

    private static boolean isPresent(String s) {
        String[] array = {"CD", "AB", "CB"};
        return Arrays.stream(array).anyMatch(s::contains);
    }

    private static String delete(int i, int next, String base) {
        return base.substring(0, i) + base.substring(next + 1);
    }

    private static boolean ifContain(char charAt, char charAt1) {
        String s = createString(charAt, charAt1);
        return s.equals("CD") || s.equals("AB") || s.equals("CB");
    }

    private static String createString(char charAt, char charAt1) {
        String result = String.valueOf(charAt) + charAt1;
        return result;
    }

}
