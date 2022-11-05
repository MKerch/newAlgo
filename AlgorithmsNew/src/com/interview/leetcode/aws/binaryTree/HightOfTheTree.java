package com.interview.leetcode.aws.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

//https://stackoverflow.com/questions/2597637/finding-height-in-binary-search-tree
//counting max of the lef and max of the right, them comparing there Max value
public class HightOfTheTree {


    public int height(Node root) {
        if (root == null) return -1;
        int result = Math.max(height(root.left), height(root.right));
//        System.out.println(result);
        return result + 1;
    }

    public int height2(Node root) {
        if (root == null) return -1;

        int lefth = height2(root.left);
        int righth = height2(root.right);

        if (lefth > righth) return lefth + 1;
        else return righth + 1;
    }

    //not working complitly ther is one test didn pass
    public int height3(Node root) {
        Queue<Node> level = new LinkedList<>();
        level.add(root);
        int countLeft = 0;
        int countRight = 0;
        while (!level.isEmpty()) {
            Node node = level.poll();
//            System.out.print(node.data + " ");
            if (node.left != null) {
                level.add(node.left);
                countLeft = countLeft + 1;
            }
            if (node.right != null) {
                level.add(node.right);
                countRight = countRight + 1;
            }
        }
        return Math.max(countLeft, countRight);
    }

    class Node {
        int data;
        Node left;
        Node right;
    }
}


