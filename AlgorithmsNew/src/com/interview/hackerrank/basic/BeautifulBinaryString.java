package com.interview.hackerrank.basic;

public class BeautifulBinaryString {

    public static void main(String[] args) {
        System.out.println(beautifulBinaryString("0100101010100010110100100110110100011100111110101001011001110111110000101011011111011001111100011101"));
    }


    public static int beautifulBinaryString(String b) {
        String x = b.replaceAll("010", "X");
        int count = 0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == 'X') count++;
        }
        return count;
    }

}
