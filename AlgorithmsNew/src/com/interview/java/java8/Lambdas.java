package com.interview.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Lambdas {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hey", "Goga", "How", "Are", "You");
        Stream<String> stream = list.stream();
        System.out.println(stream.count());
        System.out.println(stream.count());
    }

}
