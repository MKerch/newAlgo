package com.interview.hackerrank.basic;

public class BeautifulDaysAtTheMovies {

    public static void main(String[] args) {
        System.out.println(beautifulDays(20, 23, 6));
    }

    public static int beautifulDays(int i, int j, int k) {
        int count = 0;
        for (int l = i; l <= j; l++) {
            int reversed = reverse(l);
            int mod = (l - reversed) % k;
            if (mod == 0) count++;
        }
        return count;
    }

    private static int reverse(int i) {
        StringBuilder builder = new StringBuilder(String.valueOf(i));
        return Integer.parseInt(builder.reverse().toString());
    }

}
