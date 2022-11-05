package com.interview;

public class LambdaExpretion {


    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Hi");
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
