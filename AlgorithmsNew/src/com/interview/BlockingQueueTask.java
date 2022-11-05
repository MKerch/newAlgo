package com.interview;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class BlockingQueueTask {

    public static void main(String[] args) throws InterruptedException {

//        BlockingQueue<String> queue = new ArrayBlockingQueue(10);
        List<String> systems = new ArrayList<>(10);
        Object o1 = new Object();
        Object o2 = new Object();
        Runnable one = () -> {
            try {
                synchronized (o1) {
                    systems.add("Hi");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable two = () -> {
            while (true) {
                String take = systems.remove(systems.size() - 1);
                System.out.println(take + " " + Instant.now());
            }
        };


        Thread oneT = new Thread(one);
        oneT.start();
//        oneT.join();
        Thread twoT = new Thread(two);
        twoT.start();
//        twoT.join();
        System.out.println("End");

    }

}



