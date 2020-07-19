package com.template.ds.techiedelight.binarytree;

import com.learning.ds.TreeNode;

// https://www.techiedelight.com/determine-binary-tree-satisfy-height-balanced-property-red-black-tree/
// READ THE EXPLANATION... GO FOR O(n)
public class IsHeightBalancedRedBlackTree {
    public static void main(String[] args) {

    }

    private static void isHeightBalanced(TreeNode<Integer> node) {

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
