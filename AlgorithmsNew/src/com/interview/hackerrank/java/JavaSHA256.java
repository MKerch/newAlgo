package com.interview.hackerrank.java;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Scanner;

public class JavaSHA256 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(encode(s));//64
    }

    private static String encode(String s){
        StringBuilder hexString = new StringBuilder(2 * s.getBytes().length);
        for (int i = 0; i < s.getBytes().length; i++) {
            String hex = Integer.toHexString(0xff);
        }
        return hexString.toString();
    }

}
