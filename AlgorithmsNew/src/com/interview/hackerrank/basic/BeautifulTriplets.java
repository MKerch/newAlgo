package com.interview.hackerrank.basic;

import java.util.List;

public class BeautifulTriplets {


    public static void main(String[] args) {

    }

    public static int beautifulTriplets(int d, List<Integer> arr) {
        // Write your code here
        int count = 0;
        outer:
        for (int i = 0; i < arr.size()-2; i++) {
            for (int j = i+1; j < arr.size()-1; j++) {
                for (int k = j+1; k < arr.size(); k++) {

                    if (arr.get(j) - arr.get(i) == d
                            && arr.get(k) - arr.get(j) == d) {
                        count++;
                        continue outer;
                    }
                    // if (i == arr.size() - 2) break;
                }
            }
        }
        return count;
    }
}
