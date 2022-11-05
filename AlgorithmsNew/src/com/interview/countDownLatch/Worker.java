package com.interview.countDownLatch;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;

public class Worker implements Runnable {
    //    private List<String> outputScraper;
    private ConcurrentLinkedQueue<String> outputScraper;
    private CountDownLatch countDownLatch;

    public Worker(ConcurrentLinkedQueue<String> outputScraper, CountDownLatch countDownLatch) {
        this.outputScraper = outputScraper;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        doSomeWork();
        outputScraper.add("Counted down");
        countDownLatch.countDown();
    }

    private void doSomeWork() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
