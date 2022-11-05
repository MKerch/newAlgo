package com.interview.real.bitish;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedListNode l = new SinglyLinkedListNode();
        l.data = 1;
        SinglyLinkedListNode l1 = new SinglyLinkedListNode();
        l1.data = 2;
        SinglyLinkedListNode l2 = new SinglyLinkedListNode();
        l2.data = 1;

        l.next = l1;
        l1.next = l2;
        SinglyLinkedListNode condense = condense(l);
        show(condense);
    }

    public static SinglyLinkedListNode condense(SinglyLinkedListNode head) {
        SinglyLinkedListNode current = head;
        SinglyLinkedListNode prev = null;
        Set<Integer> set = new HashSet<>();
        while (current != null) {
            boolean isAdded = set.add(current.data);
            if (!isAdded) {
                prev.next = current.next;
                current = current.next;
            } else {
                prev = current;
                current = current.next;
            }
        }
        return head;
    }

    public static void show(SinglyLinkedListNode head) {
        SinglyLinkedListNode current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}


class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;
}
