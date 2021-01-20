package com.practice.ds.leetcode;

import com.learning.ds.TreeNode;

import java.util.concurrent.atomic.AtomicInteger;

public class L129_SumRootToLeafNumbers {
    public static void main(String[] args) {
        TreeNode<Integer> node = createTree();
        AtomicInteger finalSum = new AtomicInteger(0);
        findSum(node, 0, finalSum);
        System.out.println(finalSum);
    }

    private static void findSum(TreeNode<Integer> node, int workingSum, AtomicInteger finalSum) {

    }
    private static TreeNode<Integer> createTree() {
        TreeNode<Integer> root = new TreeNode(4);
        root.left = new TreeNode(9);
        root.right = new TreeNode(0);

        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(1);


        return root;
    }
}
