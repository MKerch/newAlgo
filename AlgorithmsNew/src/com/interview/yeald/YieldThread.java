package com.interview.yeald;

public class YieldThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName());
        }
        Thread.yield();

    }
}
