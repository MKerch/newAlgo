package com.interview.hackerrank.java;

import java.util.Scanner;

public class JavaGenerics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        Object[] array = new Object[value];
        for (int i = 0; i < value; i++) {
            array[i] = scanner.nextLine();
        }
        print(array);
    }

    private static void  print(Object[] array){
        for (Object t : array) {
            System.out.println(t);
        }

    }

}
