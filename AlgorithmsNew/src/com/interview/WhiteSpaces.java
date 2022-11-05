package com.interview;

public class WhiteSpaces {

    public static void main(String[] args) {
        String str = "nana       nan      n";
        System.out.println(removeWhiteSpaces(str));
    }

    private static String removeWhiteSpaces(String str) {
        String s = str.replaceAll(" ", "");
        return s;


    }

}
