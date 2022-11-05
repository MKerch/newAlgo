package com.interview.waitNotify.two;

public class ThreadB extends Thread{

    CustomWaiteNotify customWaiteNotify;

    public ThreadB(CustomWaiteNotify customWaiteNotify) {
        this.customWaiteNotify = customWaiteNotify;
    }

    @Override
    public void run() {
        customWaiteNotify.pizzaGuy();
    }
}
