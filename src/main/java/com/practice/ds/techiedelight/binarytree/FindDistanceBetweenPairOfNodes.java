package com.practice.ds.techiedelight.binarytree;

import com.learning.ds.TreeNode;

import java.util.concurrent.atomic.AtomicInteger;

// https://www.techiedelight.com/distance-between-given-pairs-of-nodes-binary-tree/
public class FindDistanceBetweenPairOfNodes {
    public static void main(String[] args) {
        int d = findDistance(createTree(), 7, 6);
        System.out.println(d);
    }

    private static int findDistance(TreeNode<Integer> node, int node1, int node2) {
        if(node == null)
            return -1;

        if(node.value == node1 || node.value == node2)
            return 0;

        int leftDistance = findDistance(node.left, node1, node2);
        int rightDistance = findDistance(node.right, node1, node2);
        if(leftDistance >= 0 && rightDistance >= 0) {
            return leftDistance + rightDistance + 1;
        }

        if(leftDistance >= 0)
            return leftDistance + 1;
        if(rightDistance >= 0)
            return rightDistance + 1;
        return -1;
    }

    private static TreeNode<Integer> createTree() {
        TreeNode<Integer> root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(7);
        root.right.right.right = new TreeNode(8);

        return root;
    }
}
