package com.interview;

public class HappyNumber {

    static int count = 1;

    public static void main(String[] args) {
        isHappy(2);
    }

    public static boolean isHappy(int n) {
        int sum = 0;
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
            int i1 = Integer.parseInt(String.valueOf(s.charAt(i)));
            sum += i1 * i1;
        }

        boolean is = sum / n == n;

        if (is && count > 1) return false;
        else if (is && count == 1) count++;

        if (sum == 1) return true;
        return isHappy(sum);
    }

}
