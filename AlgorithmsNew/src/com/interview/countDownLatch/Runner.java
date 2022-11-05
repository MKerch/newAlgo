package com.interview.countDownLatch;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;

public class Runner {


    public static void main(String[] args) throws InterruptedException {
        whenParallelProcessing_thenMainThreadWillBlockUntilCompletion();
    }


    public static void whenParallelProcessing_thenMainThreadWillBlockUntilCompletion() throws InterruptedException {

//        List<String> outputScraper = Collections.synchronizedList(new ArrayList<>());
        ConcurrentLinkedQueue<String> list = new ConcurrentLinkedQueue<>();
        CountDownLatch countDownLatch = new CountDownLatch(5);

        for (long count = 5; count > 0; count--) {
            Thread thread = new Thread(new Worker(list, countDownLatch));
            thread.start();
        }

        countDownLatch.await();
        list.add("Latch released");
        for (String s : list) {
            System.out.println(s);
        }
    }

}
