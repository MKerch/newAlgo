package com.interview;

import java.util.Arrays;

public class LambdaTest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        Arrays.stream(array).filter(v -> v % 2 == 0).forEach(System.out::println);
    }

}
