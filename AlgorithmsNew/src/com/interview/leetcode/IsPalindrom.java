package com.interview.leetcode;

import java.util.Arrays;

public class IsPalindrom {

//    public static void main(String[] args) {
//        int x = -121;
//        System.out.println(isPalindrom(x));
//    }

    public static void main(String[] args) {
        int[] queries = {1, 2, 3, 4, 5, 90};
        long[] longs = kthPalindrome(queries, 3);
        Arrays.stream(longs).forEach(System.out::println);
    }

    public static long[] kthPalindrome(int[] queries, int intLength) {
        long[] resultAr = new long[queries.length];
        boolean odd = intLength % 2 == 0;
        for (int i = 0, j = 0; i < queries.length; i++) {
            int[] array = new int[intLength];
            int v = queries[i] < 9 ? queries[i] - 1 : 9;
            while (j < intLength) {
                if (v == 9) array[j] = 9;
                else array[j] = 1;
                j++;
            }
            j = 0;
            if (odd) {
                array[intLength / 2 - 1] = v;
                array[intLength / 2] = v;
            } else array[intLength / 2] = v;
            StringBuilder builder = new StringBuilder();
            int k = 0;
            while (k < array.length) {
                builder.append(array[k]);
                k++;
            }
            resultAr[i] = Long.parseLong(builder.toString());
        }
        return resultAr;
    }

    private static boolean isPalindrom(int x) {
        String s = String.valueOf(x);
        for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) return false;
        }
        return true;
    }

}
