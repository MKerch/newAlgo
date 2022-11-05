package com.interview.java.java8;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinPo {

    public static void main(String[] args) {

//        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
        System.out.println(forkJoinPool.getParallelism());

    }

}
