package com.interview.leetcode.aws.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintByLevel {


    public void byLevel(Node root) {
        Queue<Node> level = new LinkedList<>();
        level.add(root);
        while (!level.isEmpty()) {
            Node node = level.poll();
            System.out.print(node.data + " ");
            if (node.left != null) level.add(node.left);
            if (node.right != null) level.add(node.right);
        }
    }

}

class Node {
    int data;
    Node left;
    Node right;
}
