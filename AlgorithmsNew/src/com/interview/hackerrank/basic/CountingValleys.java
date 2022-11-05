package com.interview.hackerrank.basic;

public class CountingValleys {

    public static void main(String[] args) {

    }

    public static int countingValleys(int steps, String path) {
        int seaLevel = 0;
        int valleyCount = 0;
        char last = 0;
        for (int i = 0; i < steps; i++) {
            char c = path.charAt(i);
            if (c == 'U') {
                seaLevel++;
                last = 'U';
            } else if (c == 'D') {
                seaLevel--;
                last = 'D';
            }
            if (seaLevel == 0 && last == 'U') valleyCount++;
        }
        return valleyCount;
    }


}
