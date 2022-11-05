package com.interview.codingbat;

public class PlusOut {

    public static void main(String[] args) {

        System.out.println(plusOut("aaxxxxbb", "xx"));

    }

    public static String plusOut(String str, String word) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            String substring = str.substring(i);
            if (!substring.startsWith(word)) builder.append("+");
            else {
                builder.append(word);
                if (word.length() != 1) i += word.length()-1;
            }
        }
        return builder.toString();
    }

}
