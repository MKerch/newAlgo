package com.interview;

import java.util.LinkedList;

public class ReverseLidkedList {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList();
        linkedList.add("Me");
        linkedList.add("He");
        linkedList.add("She");
        LinkedList<String> linkedListUpdated = new LinkedList();
        linkedList.descendingIterator()
                .forEachRemaining(linkedListUpdated::add);
        System.out.println(linkedListUpdated);
    }

}
