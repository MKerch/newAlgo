package com.interview;

public class CustomQueue {

    private int countItems;
    private int front;//index
    private int rear;//index
    private int[] queueArray;//
    private int maxSize;

    public CustomQueue(int maxSize) {
        this.maxSize = maxSize;
        queueArray = new int[maxSize];
        front = 0;
        rear = 0;
        countItems = 0;
    }

    public void enQueue(int value) {
        if (queueArray.length == countItems) return;
        queueArray[rear] = value;
        rear++;
        countItems++;
    }

    public int deQueue() {
        int removed = queueArray[front];
        front++;
        countItems--;
        return removed;
    }

    public void show() {
        for (int i = 0; i < countItems; i++) {
            System.out.println(i + " : " + queueArray[i]);
        }
    }


}
