package com.interview.hackerrank.java;

public class Java1DArrayPart2 {

    public static void main(String[] args) {
        System.out.println(canWin(5, new int[]{0, 0, 0, 1, 1, 1}));
    }

    public static boolean canWin(int leap, int[] game) {
        for (int i = 0; i < game.length-leap; ) {
            if (game[i + 1] == 0) {
                i++;
                continue;
            }
            if (game[i + leap] == 0) {
                i += leap;
                continue;
            }
            if (i == game.length - 1 || i + leap >= game.length) {
                return true;
            }

            if (game[i + 1] != 0 || game[i + leap] != 0 || i != game.length - 1 || i + leap < game.length) {
                return false;
            }
        }
        return false;
    }


    public static boolean canWin(int leap, int[] game, int i) {
        if (i > game.length - 1) return true;
        if (i < 0 || game[i] == 1) return false;
        game[i] = 1;
        return canWin(leap, game, i + leap) || canWin(leap, game, i + 1) || canWin(leap, game, i - 1);
    }
    //System.out.println( (canWin(leap, game, 0)) ? "YES" : "NO" );

}
