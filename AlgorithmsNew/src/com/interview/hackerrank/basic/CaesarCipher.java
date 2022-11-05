package com.interview.hackerrank.basic;

public class CaesarCipher {

    public static void main(String[] args) {

        System.out.println(
//                caesarCipher("abcdefghijklmnopqrstuvwxyz", 2));
//                caesarCipher("middle-Outz", 2));
//                caesarCipher("1X7T4VrCs23k4vv08D6yQ3S19G4rVP188M9ahuxB6j1tMGZs1m10ey7eUj62WV2exLT4C83zl7Q80M", 27));
                caesarCipher("DNFjxo?b5h*5<LWbgs6?V5{3M].1hG)pv1VWq4(!][DZ3G)riSJ.CmUj9]7Gzl?VyeJ2dIPEW4GYW*scT8(vhu9wCr]q!7eyaoy.", 45));
        //cdefghijklmnopqrstuvwxyzab

    }

    public static String caesarCipher(String s, int k) {
        String alfa = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            boolean upperCase = Character.isUpperCase(s.charAt(i));
            boolean isDigit = Character.isDigit(s.charAt(i));
            boolean isAlphabetic = Character.isAlphabetic(s.charAt(i));
            int index = 0;
            if (!upperCase) index = alfa.indexOf(s.charAt(i)) + k;
            else index = alfa.indexOf(Character.toLowerCase(s.charAt(i))) + k;

            if (index > alfa.length() - 1) {
                index = index % alfa.length();
            } else if (index - k < 0 && !upperCase) {
                continue;
            }
            if (upperCase) result.setCharAt(i, Character.toUpperCase(alfa.charAt(index)));
            else if (isDigit || !isAlphabetic) result.setCharAt(i, s.charAt(i));
            else result.setCharAt(i, alfa.charAt(index));
        }
        return result.toString();
    }

}
