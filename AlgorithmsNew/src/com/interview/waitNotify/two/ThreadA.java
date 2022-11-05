package com.interview.waitNotify.two;

public class ThreadA extends Thread{

    private CustomWaiteNotify customWaiteNotify;

    public ThreadA(CustomWaiteNotify customWaiteNotify) {
        this.customWaiteNotify = customWaiteNotify;
    }

    @Override
    public void run() {
        try {
             customWaiteNotify.eatPizza();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
