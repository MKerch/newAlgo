package com.interview.hackersRank.day2;

public class FlipMatrix {


    public static void main(String[] args) {
        String s = "9875";
        System.out.println(sumIntFromString(s));
    }

    private static Integer sumIntFromString(String s) {
        int result = Integer.parseInt(s);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int end = result % 10;
            sum += end;
            result = result / 10;
        }
        return sum;
    }
}
