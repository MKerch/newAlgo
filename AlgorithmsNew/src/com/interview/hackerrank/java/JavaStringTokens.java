package com.interview.hackerrank.java;

public class JavaStringTokens {

    public static void main(String[] args) {
//        String s = "He is a very very good boy, isn't he?";
//        String s = "           YES      leading spaces        are valid,    problemsetters are         evillllll";
        String s = "                        ";
        String trimed = s.trim();
        if (trimed.isEmpty()) {
            System.out.println(trimed.length());
            return;
        }
        String[] array = trimed.split("[ !,?._'@]+");
        System.out.println(array.length);
        for (String st : array) {
            System.out.println(st);
        }
    }

}
