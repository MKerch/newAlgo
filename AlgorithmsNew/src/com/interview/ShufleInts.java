package com.interview;

import java.util.Arrays;
import java.util.Random;

public class ShufleInts {

    public static void main(String[] args) {
        int[] array = {2, 5, 4, 6, 7};

        System.out.println(Arrays.toString(shafle(array)));
    }

    private static int[] shafle(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomIndexToSwap = rand.nextInt(array.length);
            int temp = array[randomIndexToSwap];
            array[randomIndexToSwap] = array[i];
            array[i] = temp;
        }
        return array;
    }

}
