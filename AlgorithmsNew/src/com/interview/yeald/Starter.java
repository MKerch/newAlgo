package com.interview.yeald;

public class Starter {

    public static void main(String[] args) throws InterruptedException {
        YieldThread y1 = new YieldThread();
        YieldThread y2 = new YieldThread();
        y1.start();
        y2.start();


        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " in control");
        }
    }

}
