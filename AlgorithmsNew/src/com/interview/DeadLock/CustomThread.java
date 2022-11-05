package com.interview.DeadLock;

public class CustomThread implements Runnable{

    Object objectOne;
    Object objectTwo;

    public CustomThread(Object objectOne, Object objectTwo) {
        this.objectOne = objectOne;
        this.objectTwo = objectTwo;
    }

    @Override
    public void run() {
        synchronized (objectOne){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (objectTwo){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
