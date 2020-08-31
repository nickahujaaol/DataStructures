package com.practice.ds.geeksforgeeks.binarytree;

import com.learning.ds.TreeNode;

import java.util.concurrent.atomic.AtomicInteger;

// https://www.techiedelight.com/find-maximum-sum-root-to-leaf-path-binary-tree/
public class FindMaxSumRootToLeafPath {
    public static void main(String[] args) {
        AtomicInteger maxSum = new AtomicInteger();
        findMaxSum(createTree(), 0, maxSum);
        System.out.println("Max Sum is : " + maxSum.get());
    }

    private static void findMaxSum(TreeNode<Integer> node, int maxSoFar, AtomicInteger maxSum) {
        if (node == null) return;

        maxSoFar += node.value;
        if (node.left == null && node.right == null) {
            maxSum.set(Math.max(maxSum.get(), maxSoFar));
        }

        findMaxSum(node.left, maxSoFar, maxSum);
        findMaxSum(node.right, maxSoFar, maxSum);
        maxSoFar -= node.value;
    }

    private static TreeNode<Integer> createTree() {
        TreeNode<Integer> root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.right.left = new TreeNode(10);
        root.right.left.left = new TreeNode(7);
        root.right.left.right = new TreeNode(9);
        root.right.right.right = new TreeNode(5);

        return root;
    }
}
