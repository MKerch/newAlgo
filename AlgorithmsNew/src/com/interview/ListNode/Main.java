package com.interview.ListNode;

public class Main {
    public static void main(String[] args) {
        ListNode root = new ListNode(2);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(3);
        root.next = listNode2;
        listNode2.next = listNode3;

        ListNode root2 = new ListNode(5);
        ListNode list2 = new ListNode(6);
        ListNode list3 = new ListNode(4);
        root2.next = list2;
        list2.next = list3;

        ListNode listNode = addTwoNumbers(root, root2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder s1 = new StringBuilder();
        while (l1 != null) {
            s1.append(l1.val);
            l1 = l1.next;
        }
        StringBuilder s2 = new StringBuilder();
        while (l2 != null) {
            s2.append(l2.val);
            l2 = l2.next;
        }
        Integer sum = Integer.parseInt(s1.toString()) + Integer.parseInt(s2.toString());
        StringBuilder builder = new StringBuilder();
//        builder.append(sum);
//        builder.reverse();
//        sum = Integer.parseInt(builder.toString());
        ListNode root = new ListNode();
        ListNode current = new ListNode();
        for (int i = 0; i < builder.length(); i++) {
            int end = sum % 10;
            sum = sum / 10;
            if (i == 0) {
                root.val = end;
                current = root;
            } else {
                ListNode listNode = new ListNode(end);
                current.next = listNode;
                current = listNode;
            }
        }
        return root;
    }

}
