package com.interview.hackerrank.basic;

public class HalloweenSale {

    public static void main(String[] args) {
//        System.out.println(howManyGames(20, 3, 6, 70));
//        System.out.println(howManyGames(20, 3, 6, 85));
//        System.out.println(howManyGames(100, 12, 55, 95));
        System.out.println(howManyGames(100, 19, 1, 180));
    }

    public static int howManyGames(int p, int d, int m, int s) {
        if (p > s) return 0;
        int gameCount = 0;
        int count = 0;
        for (int i = p; i > m; i -= d) {
            count += i;
            if(count>s) return gameCount;
            gameCount++;
        }
        if (count < s) {
            int rest = s - count;
            while (rest >= m) {
                rest = rest - m;
                gameCount++;
            }
        }
        return gameCount;
    }

}
