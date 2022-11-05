package com.interview;

public class CustomStack {

    private int maxSize;
    private int topIndex;//index
    private char[] stackArray;

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        this.topIndex = -1;
        stackArray = new char[maxSize];
    }

    public char pop() {//delete
        if (isEmpty()) return '0';
        char deleted = stackArray[topIndex];
        topIndex--;
        return deleted;
    }

    public int push(char ch) {
        if (isFull()) return -1;
        topIndex++;
        stackArray[topIndex] = ch;
        return 1;
    }

    public char peak() {//get last
        return stackArray[topIndex];
    }

    public boolean isFull() {
        return maxSize - 1 == topIndex;
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }


}
