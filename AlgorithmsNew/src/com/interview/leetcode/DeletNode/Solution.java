package com.interview.leetcode.DeletNode;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {

//        ListNode five = new ListNode(3);
        ListNode fore = new ListNode(3);
        ListNode three = new ListNode(1, fore);
        ListNode two = new ListNode(1, three);
        ListNode root = new ListNode(1, two);
        ListNode listNode = deleteDuplicates2(root);
        showList(listNode);

    }

    private static void showList(ListNode listNode) {
        ListNode current = listNode;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        Set<Integer> set = new LinkedHashSet<>();
        while (current != null) {
            set.add(current.val);
//            System.out.println(current.val);
            current = current.next;
        }

        Iterator<Integer> iterator = set.iterator();
        ListNode root = head;
        while (iterator.hasNext()) {
            root.val = iterator.next();
            if (!iterator.hasNext()) {
                root.next = null;
                break;
            }
            root = root.next;
        }
        return head;
    }

    public static ListNode deleteDuplicates2(ListNode head) {
        ListNode current = head;
        Set<Integer> set = new LinkedHashSet<>();
        while (current != null) {
            boolean add = set.add(current.val);
            if(!add){

            }
            current = current.next;
        }

        Iterator<Integer> iterator = set.iterator();
        ListNode root = head;
        while (iterator.hasNext()) {
            root.val = iterator.next();
            if (!iterator.hasNext()) {
                root.next = null;
                break;
            }
            root = root.next;
        }
        return head;
    }


}
