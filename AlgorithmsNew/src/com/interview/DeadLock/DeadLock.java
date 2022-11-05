package com.interview.DeadLock;

public class DeadLock {

    public static void main(String[] args) {
        Object one = new Object();
        Object two = new Object();

        CustomThread customThread = new CustomThread(one, two);
        CustomThread customThreadTwo = new CustomThread(two, one);

        Thread thread = new Thread(customThread);
        Thread threadTwo = new Thread(customThreadTwo);
        thread.start();
        threadTwo.start();
    }

}
