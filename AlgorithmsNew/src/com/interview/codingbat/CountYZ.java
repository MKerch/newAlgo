package com.interview.codingbat;

public class CountYZ {

    public static void main(String[] args) {

        System.out.println(countYZ("fez day"));
    }

    public static int countYZ(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.toLowerCase(str.charAt(i)) == 'z' || Character.toLowerCase(str.charAt(i)) == 'y') {
                if (i < str.length() - 1 && !Character.isLetter(str.charAt(i + 1))) {
                    count++;
                } else if (i == str.length() - 1) {
                    count++;
                }
            }
        }
        return count;
    }

}
