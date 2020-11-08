package com.learning.ds.techiedelight;

import com.learning.ds.TreeNode;

public class L98_ValidateBinarySearchTree {
    public static void main(String[] args) {
        boolean isBst = isBST(createTree(), Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println("Is BST: " + isBst);
    }

    private static boolean isBST(TreeNode<Integer> node, int minVal, int maxValue) {
        if(node == null)
            return true;

        if(node.value < minVal || node.value > maxValue)
            return false;

        return isBST(node.left, minVal, node.value) && isBST(node.right, node.value, maxValue);
    }

    private static TreeNode<Integer> createTree() {
        TreeNode<Integer> root = new TreeNode(20);
        root.left = new TreeNode(10);
        root.right = new TreeNode(30);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(40);

        return root;
    }
}
