package com.interview.leetcode;

public class SumTwoLinkedLists {


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder sum1 = new StringBuilder();
        StringBuilder sum2 = new StringBuilder();

        ListNode current = l1;
        while (current.next != null) {
            sum1.append(l1.val);
            current = current.next;
        }
        ListNode current2 = l2;
        while (current2.next != null) {
            sum2.append(l2.val);
            current2 = current2.next;
        }
        Integer sum = Integer.parseInt(sum1.toString()) + Integer.parseInt(sum2.toString());
        StringBuilder append = new StringBuilder(sum).reverse();
        ListNode root = new ListNode();
        ListNode curr = root;
        for (int i = 0; i < append.toString().toCharArray().length; i++) {
            if (i == 0) curr.val = append.toString().toCharArray()[i];
            else {
                ListNode newNode = new ListNode();
                curr.next = newNode;
                curr = newNode;
            }
        }
        return root;
    }

    public static void show(ListNode listNode) {
        while (listNode.next != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static void main(String[] args) {
        ListNode one = new ListNode();
        ListNode next = new ListNode();
        one.val = 1;
        one.next = next;
        ListNode next2 = new ListNode();
        ListNode two = new ListNode();
        two.val = 2;
        two.next = next2;
        ListNode listNode = addTwoNumbers(one, two);
        show(listNode);
    }


}
