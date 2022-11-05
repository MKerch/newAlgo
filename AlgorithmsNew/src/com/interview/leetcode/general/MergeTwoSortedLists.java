package com.interview.leetcode.general;

public class MergeTwoSortedLists {
//Todo
    public static void main(String[] args) {

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return list1;
            ListNode root = new ListNode(list1.val);
        while (list1 != null || list2 != null) {
            if (list1 != null && list2 != null) {
                ListNode next = new ListNode(list1.val);
                root.next = new ListNode(list2.val, next);
            } else if (list2 != null) {
                root.next = new ListNode(list2.val);
            } else if (list1 != null) {
                root.next = new ListNode(list1.val);
            }
            list1 = list1.next;
            list2 = list2.next;
        }
        return root;
    }


}

class ListNode {
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
