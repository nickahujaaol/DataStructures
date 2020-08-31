package com.practice.ds.geeksforgeeks.binarytree;

import com.learning.ds.TreeNode;

import java.util.concurrent.atomic.AtomicInteger;

// https://www.techiedelight.com/find-maximum-difference-node-descendants/
public class MaxDiffBetweenNodesAndDescendents {
    public static void main(String[] args) {
        TreeNode<Integer> root = createTree();
        AtomicInteger maxDiff = new AtomicInteger();
        findMaxDiff(root, maxDiff);
        System.out.println("Max diff is: " + maxDiff.get());
    }

    private static int findMaxDiff(TreeNode<Integer> node, AtomicInteger maxDiff) {
        if (node == null) return Integer.MAX_VALUE;

        int leftMin = findMaxDiff(node.left, maxDiff);
        int rightMin = findMaxDiff(node.right, maxDiff);

        int maxDifference = node.value - Math.min(leftMin, rightMin);
        maxDiff.set(Math.max(maxDiff.get(), maxDifference));

        return Math.min(Math.min(leftMin, rightMin), node.value);
    }

    private static TreeNode<Integer> createTree() {
        TreeNode<Integer> root = new TreeNode(6);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(4);
        root.right.left.left = new TreeNode(1);
        root.right.left.right = new TreeNode(7);
        return root;
    }
}
