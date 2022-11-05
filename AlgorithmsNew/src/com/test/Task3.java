package com.test;


public class Task3 {

    public static void main(String[] args) {
        String s = "CBACD";
        String result = compute(s);
        System.out.println(result);
    }

    private static String compute(String s) {
        StringBuilder current = new StringBuilder(s);
        for (int i = 0; i < current.length() - 1; i++) {

            boolean removed = removeChars(current.charAt(i), current.charAt(i + 1), current);

            if (removed && current.charAt(i + 1) != current.length()) compute(current.toString());
            else if (current.charAt(i + 1) != current.length()) compute(current.toString());
            else return current.toString();
        }
        return current.toString();
    }

    private static boolean removeChars(char charAt, char charAt1, StringBuilder current) {
        String s = makeString(charAt, charAt1);
        boolean contains = isContains(charAt, charAt1, current);
        if(contains) {
            current.delete(s.indexOf(charAt), s.indexOf(charAt1));
            return true;
        }
        else return false;
    }

    private static boolean isContains(char charAt, char charAt1, StringBuilder current) {
        String s = makeString(charAt, charAt1);
        if ((s).equals("CD")
                || (s).equals("AB")
                || (s).equals("BA")) {
            return true;
        }
        return false;
    }
    private static String makeString(char charAt, char charAt1){
        String s = "" + charAt + charAt1;
        return s;
    }


}
