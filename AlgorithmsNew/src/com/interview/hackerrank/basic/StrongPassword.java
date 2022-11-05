package com.interview.hackerrank.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPassword {

    public static void main(String[] args) {
//        System.out.println(minimumNumber(3, "Ab1"));
        System.out.println(minimumNumber(5, "E!%Z@"));
    }

    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int count = 4;
        boolean isOk = n >= 6;

        //if (isOk) count--;

        Pattern p = Pattern.compile(
                "[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(password);
        boolean isSpecialCharacter = m.find();
        if (isSpecialCharacter) count--;

        boolean isDigit = false;
        boolean isLowerCase = false;
        boolean isUpperCase = false;
        for (int i = 0; i < n; i++) {
            char current = password.charAt(i);
            if (Character.isDigit(current) && !isDigit) {
                isDigit = true;
                count--;
            }
            if (Character.isLowerCase(current) && !isLowerCase) {
                isLowerCase = true;
                count--;
            }
            if (Character.isUpperCase(current) && !isUpperCase) {
                isUpperCase = true;
                count--;
            }
        }
        int rest = 0;
        if (!isOk) {
            if (count > 6 - n) rest = count;
            else rest = 6 - n;
        }
        return isOk ? count : rest;
    }

}
