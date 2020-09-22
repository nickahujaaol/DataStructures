package com.learning.ds.techiedelight.binarytree;

import com.learning.ds.TreeNode;

import java.util.concurrent.atomic.AtomicInteger;

// https://www.techiedelight.com/determine-binary-tree-satisfy-height-balanced-property-red-black-tree/
// READ THE EXPLANATION... GO FOR O(n)
public class IsHeightBalancedRedBlackTree {
    public static void main(String[] args) {
        AtomicInteger minHeight = new AtomicInteger(0);
        int maxHeight = isHeightBalanced(createTree(), minHeight);
        System.out.println("Min Height : " + minHeight);
        System.out.println("Max Height : " + maxHeight);
        boolean isBalanced = maxHeight - 2 * minHeight.get() <= 0;
        System.out.println("Is Balanced: " + isBalanced);
    }

    /*
    MAKE SURE YOU USE RETURN TYPE TO FIND MAX AND USE ATOMIC INTEGER TO GET MIN.
    VICE VERSA DOES NOT WORK. DO A DRY RUN.
     */
    private static int isHeightBalanced(TreeNode<Integer> node, AtomicInteger minHeight) {
        if(node == null)
            return 0;
        int leftHeight = 1 + isHeightBalanced(node.left, minHeight);
        int rightHeight = 1 + isHeightBalanced(node.right, minHeight);
        //maxHeight.set(Math.max(maxHeight.get(), 1 + Math.max(leftHeight, rightHeight)));
        minHeight.set(Math.min(leftHeight, rightHeight));
        return Math.max(leftHeight, rightHeight);
    }

    private static TreeNode<Integer> createTree() {
        TreeNode<Integer> root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(7);
        root.right.left.right = new TreeNode(8);
        root.right.left.left.left = new TreeNode(9);
        root.right.left.left.right = new TreeNode(10);
        return root;
    }
}
