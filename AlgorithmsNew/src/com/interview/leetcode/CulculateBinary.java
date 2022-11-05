package com.interview.leetcode;

import java.util.HashMap;
import java.util.Map;

public class CulculateBinary {

    public static void main(String[] args) {
        String[] array = {"10", "0", "1"};
        int m = 1;//0
        int n = 1;//1
        System.out.println(cululate(array, m, n));
    }

    private static int cululate(String[] array, int m, int n) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isOk = isOk(array[i], m, n);
            if (isOk) count++;
        }
        return count;
    }

    private static boolean isOk(String s, int m, int n) {
        Map<Character, Integer> map = new HashMap<>();
        CompareWords.loopMap(s, map);
        Integer zeroCount = map.get('0');
        Integer oneCount = map.get('1');
        if (zeroCount != null && zeroCount <= m && oneCount != null && oneCount <= n) return true;
        else if (zeroCount == null && oneCount != null && oneCount <= n) return true;
        else if (oneCount == null && zeroCount != null && zeroCount <= m) return true;
        else return false;
    }
}
