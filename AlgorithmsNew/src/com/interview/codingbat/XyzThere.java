package com.interview.codingbat;

public class XyzThere {

    public static void main(String[] args) {
        System.out.println(xyzThere("abcxyz"));
    }

    public static boolean xyzThere(String str) {String current = str.replaceAll("\\.xyz", "");
        if (current.contains("xyz")) return true;
        else if (str.length() > current.length()) return false;
        return false;
    }

}
