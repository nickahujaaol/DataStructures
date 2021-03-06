package com.template.ds.techiedelight.binarytree;

import com.learning.ds.TreeNode;

import java.util.concurrent.atomic.AtomicInteger;

// https://www.techiedelight.com/find-maximum-sum-path-between-two-leaves-in-a-binary-tree/
public class MaxSumPathBetween2Leaves {
    public static void main(String[] args) {
        TreeNode<Integer> root = createTree();
        AtomicInteger maxSum = new AtomicInteger();
        findMaxPath(root, maxSum);
        System.out.println("Max Sum is: " + maxSum.get());
    }

    private static int findMaxPath(TreeNode<Integer> node, AtomicInteger maxSum) {
        return 0;
    }


    private static TreeNode<Integer> createTree() {
        TreeNode<Integer> root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(-4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(7);
        root.right.left.right = new TreeNode(8);
        return root;
    }
}
