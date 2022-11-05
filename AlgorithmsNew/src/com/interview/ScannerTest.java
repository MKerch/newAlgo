package com.interview;

import java.util.Random;
import java.util.Scanner;

public class ScannerTest {

    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_BLACK = "\u001B[30m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_GREEN = "\u001B[32m";
    public static final String TEXT_YELLOW = "\u001B[33m";
    public static final String TEXT_BLUE = "\u001B[34m";
    public static final String TEXT_PURPLE = "\u001B[35m";
    public static final String TEXT_CYAN = "\u001B[36m";
    public static final String TEXT_WHITE = "\u001B[37m";
    public static final String[] array = {TEXT_GREEN, TEXT_CYAN, TEXT_BLUE, TEXT_BLACK, TEXT_PURPLE, TEXT_RED, TEXT_WHITE, TEXT_YELLOW};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = array.length - 1;
        while (scanner.hasNext()) {
            int i = new Random().nextInt(size);
            System.out.println(array[i] + scanner.next() + " " + TEXT_RESET);
        }
    }
}
