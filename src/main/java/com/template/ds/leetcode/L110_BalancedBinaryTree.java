package com.template.ds.leetcode;

import com.learning.ds.TreeNode;

import java.util.concurrent.atomic.AtomicBoolean;

public class L110_BalancedBinaryTree {
    public static void main(String[] args) {
        TreeNode<Integer> root = createTree();
        AtomicBoolean balanced = new AtomicBoolean(true);
        isBalanced(root, balanced);
        System.out.println(balanced);
    }

    private static int isBalanced(TreeNode<Integer> node, AtomicBoolean balanced) {
        return 0;
    }

    private static TreeNode<Integer> createTree() {
        TreeNode<Integer> root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        //root.left.left.left = new TreeNode(6);
        //root.left.left.right = new TreeNode(7);
        return root;
    }
}
