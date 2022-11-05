package com.interview.hackerrank.basic;

public class PasswordDecription {

    public static void main(String[] args) {

        System.out.println(decryptPassword("51Pa*0Lp*0e"));//aP1pL5e

    }

//    public static String decryptePassword(String s) {
//        StringBuilder bul = new StringBuilder(s);
//        for (int i = 0; i < bul.length() - 1; i++) {
//            if (Character.isLowerCase(bul.charAt(i)) && Character.isUpperCase(bul.charAt(i + 1))) {
//                bul.setCharAt(i, bul.charAt(i + 1));
//                bul.setCharAt(i + 1, bul.charAt(i));
//                bul.insert(i + 1, '*');
//                i = i + 1;
//                continue;
//            }
//            if (Character.isDigit(bul.charAt(i))) {
//                bul.setCharAt(i, '0');
//                bul.insert(0, bul.charAt(i));
//                i = i + 1;
//                continue;
//            }
//            if (i == s.length()) break;
//        }
//        return bul.toString();
//    }

    public static String decryptPassword(String s) {
        StringBuilder builder = new StringBuilder(s);
        int numCount = 0;
        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == '0') {
                numCount++;
            }
            if (builder.charAt(i) == '*') {
                char c1 = builder.charAt(i - 1);
                char c2 = builder.charAt(i - 2);
                builder.setCharAt(i - 2, c1);
                builder.setCharAt(i - 1, c2);
                builder.deleteCharAt(i);
                i--;
            }
        }
        updateZeros(builder, numCount);

        return builder.toString();
    }

    private static void updateZeros(StringBuilder builder, int count) {
        String nums = builder.substring(0, count);
        int numsIndex = nums.length() - 1;
        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == '0') {
                builder.setCharAt(i, nums.charAt(numsIndex));
                numsIndex--;
                builder.deleteCharAt(0);
            }
        }
    }


}
