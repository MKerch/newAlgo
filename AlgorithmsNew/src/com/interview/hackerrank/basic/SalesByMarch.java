package com.interview.hackerrank.basic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesByMarch {

    public static void main(String[] args) {

    }

    public static int sockMerchant(int n, List<Integer> ar) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int color = ar.get(i);
            if (map.get(color) == null) map.put(color, 1);
            else {
                int pair = map.get(color) + 1;
                map.put(color, pair);
                if (pair % 2 == 0) count++;
            }
        }
        return count;
    }

}
