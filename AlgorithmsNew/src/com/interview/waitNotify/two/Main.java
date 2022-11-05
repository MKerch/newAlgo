package com.interview.waitNotify.two;

public class Main {

    public static void main(String[] args) {
        CustomWaiteNotify customWaiteNotify = new CustomWaiteNotify();

        ThreadA threadA = new ThreadA(customWaiteNotify);
        ThreadB threadB = new ThreadB(customWaiteNotify);

        threadA.start();
        threadB.start();
    }

}
