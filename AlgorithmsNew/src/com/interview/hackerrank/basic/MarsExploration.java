package com.interview.hackerrank.basic;

public class MarsExploration {

    public static void main(String[] args) {
//        String s = "SOSSPSSQSSOR";
        String s = "SOSOOSOSOSOSOSSOSOSOSOSOSOS";
        System.out.println(marsExploration(s));
    }


    public static int marsExploration(String s) {
        int count = 0;
        String sos = "SOS";
        int len = sos.length();
        for (int i = 0; i < s.length(); i += len) {
            String current = s.substring(i);
            if (!current.startsWith(sos)) {
                for (int j = 0; j < len; j++) {
                    if (current.charAt(j) != sos.charAt(j))
                        count++;
                }
            }
        }
        return count;
    }

}
