package com.practice.ds.techiedelight.binarytree;

import com.learning.ds.TreeNode;

import java.util.concurrent.atomic.AtomicBoolean;

// https://www.techiedelight.com/determine-binary-tree-satisfy-height-balanced-property-red-black-tree/
// READ THE EXPLANATION... GO FOR O(n)
public class IsHeightBalancedRedBlackTree {
    public static void main(String[] args) {
        AtomicBoolean balanced = new AtomicBoolean(true);
        isHeightBalanced(createTree(), balanced);
        System.out.println(balanced);
    }

    private static int isHeightBalanced(TreeNode<Integer> node, AtomicBoolean balanced) {
        if(node == null)
            return 0;

        int leftHeight = isHeightBalanced(node.left, balanced);
        int rightHeight = isHeightBalanced(node.right, balanced);
        if(leftHeight > rightHeight && rightHeight > 0) {
            boolean isBalanced = leftHeight/rightHeight <= 2;
            balanced.set(isBalanced);
        } else if(leftHeight < rightHeight && leftHeight > 0) {
            boolean isBalanced = rightHeight / leftHeight <= 2;
            balanced.set(isBalanced);
        }

        return 1 + Math.max(leftHeight, rightHeight);
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
        root.right.left.left.right.right = new TreeNode(11);
        return root;
    }
}
