package com.interview.hackersRank.dau3;

public class CharPlusThree {
    public static void main(String[] args) {
//        String s = "abcdefghijklmnopqrstuvwxyz";
        String s = "middle-Outz";
//        int i = 'Z';
//        System.out.println(i);
        System.out.println(incodeRotatePlusThree(s, 3));
    }

    private static String incodeRotatePlusThree(String s, int k) {
        char[] chars = s.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            int val = (char) (chars[i] + k);
            if (val > 122 && chars[i] > 95) {
                int diff = (val - 96) % 26;
                val = 96 + diff;
                result.append((char) val);
            } else if (chars[i] < 95) {
                result.append(chars[i]);
            } else {
                result.append((char) val);
            }
        }
        return result.toString();
    }

}
