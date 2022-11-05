package com.interview.leetcode.linkedList.deleteNode;

public class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public void show() {
        ListNode current = this;
        while (current.next != null) {
            System.out.println(current.val);
            current = current.next;
        }
        System.out.println(current.val);
    }

    public void deleteNode(ListNode toDelete) {
        ListNode current = this;
        ListNode prev = null;

        while (current.next != null) {
            if (current.val == toDelete.val) {
                prev.next = toDelete.next;
                break;
            }
            prev = current;
            current = current.next;
        }
    }

    public void deleteNt(ListNode root, int n) {
        ListNode current = root;
        ListNode prev = null;
        int count = 0;
        while (current.next != null) {
            count++;
            if (count == n) {
                prev.next = current.next;
                break;
            }
            prev = current;
            current = current.next;
        }
    }

    public void reverse(ListNode root) {
        ListNode pointer = root;
        ListNode previous = null, current = null;
        while (pointer != null) {
            current = pointer;
            pointer = pointer.next;

            current.next = previous;
            previous = current;
            root = current;
        }
        this.show();
    }
}
