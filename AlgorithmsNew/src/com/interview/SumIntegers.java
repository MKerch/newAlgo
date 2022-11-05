package com.interview;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumIntegers {

    public static void main(String[] args) {
        int [] array = new int[]{1, 2, 3, 4, 5, 6};
        int sum = Arrays.stream(new int[]{1, 2, 3, 4, 5, 6}).sum();
        int sum1 = IntStream.of(array).sum();
        System.out.println(sum1);

    }

}
