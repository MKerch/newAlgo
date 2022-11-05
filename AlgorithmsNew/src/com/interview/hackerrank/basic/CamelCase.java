package com.interview.hackerrank.basic;

public class CamelCase {

    public static void main(String[] args) {
        System.out.println(camelcase("saveChangesInTheEditor"));
    }

    public static int camelcase(String s) {
        // Write your code here
        String[] split = s.split("\\p{Upper}");
        return split.length;
    }

}
