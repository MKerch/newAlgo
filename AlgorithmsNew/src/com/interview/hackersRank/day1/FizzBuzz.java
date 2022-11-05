package com.interview.hackersRank.day1;

public class FizzBuzz {

    public static void main(String[] args) {
        fizzbuzz(12);
    }

    private static void fizzbuzz(int i) {
        for (int n = 1; n < i; n++) {
            if (n % 5 == 0 && n % 3 == 0) System.out.println("FizzBuzz");
            else if (n % 3 == 0) System.out.println("Fizz");
            else if (n % 5 == 0) System.out.println("Buzz");
            else System.out.println(n);
        }
    }

}
