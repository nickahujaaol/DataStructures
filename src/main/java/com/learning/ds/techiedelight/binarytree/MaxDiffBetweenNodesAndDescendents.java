package com.learning.ds.techiedelight.binarytree;

import com.learning.ds.TreeNode;

import java.net.Inet4Address;
import java.util.concurrent.atomic.AtomicInteger;

// https://www.techiedelight.com/find-maximum-difference-node-descendants/
public class MaxDiffBetweenNodesAndDescendents {
    public static void main(String[] args) {
        TreeNode<Integer> root = createTree();
        AtomicInteger maxSum = new AtomicInteger();
        findMaxDiff(root, maxSum);
        System.out.println("Max diff is: " + maxSum.get());
    }

    private static int findMaxDiff(TreeNode<Integer> node, AtomicInteger maxSum) {
        if(node == null) return 0;

        int leftSum = findMaxDiff(node.left, maxSum);
        int rightSum = findMaxDiff(node.right, maxSum);

        int maxSumAtNode = Math.max(node.value - leftSum, node.value - rightSum);
        maxSum.set(Math.max(maxSum.get(), maxSumAtNode));

        return maxSumAtNode;
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
