package com.interview.hackerrank.java;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Scanner;

public class JavaMD5 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        System.out.println(doHashing(password));
    }

    public static String doHashing(String password) throws Exception {
        MessageDigest message = MessageDigest.getInstance("MD5");
        message.update(password.getBytes());
        byte[] result = message.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : result) {
            String format = String.format("%02x", b);
            sb.append(format);
        }
        return sb.toString();
    }


}
