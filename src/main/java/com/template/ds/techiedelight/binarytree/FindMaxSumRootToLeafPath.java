package com.template.ds.techiedelight.binarytree;

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
        root.right.right.right  = new TreeNode(5);

        return root;
    }
}
