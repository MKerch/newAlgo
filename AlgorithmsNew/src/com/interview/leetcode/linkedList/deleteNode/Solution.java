package com.interview.leetcode.linkedList.deleteNode;

public class Solution {

    public static void main(String[] args) {

        ListNode root = new ListNode(1);
        ListNode list2 = new ListNode(4);
        ListNode list3 = new ListNode(5);
        ListNode list4 = new ListNode(7);

        root.next = list2;
        list2.next = list3;
        list3.next = list4;

        root.show();
//        root.deleteNode(list3);
//        root.deleteNt(root, 2);
        System.out.println("-----------------");
        root.reverse(root);
//        root.show();
    }




}
