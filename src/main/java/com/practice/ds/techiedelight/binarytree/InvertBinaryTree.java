package com.practice.ds.techiedelight.binarytree;

import com.learning.ds.TreeNode;

// https://www.techiedelight.com/invert-binary-tree-recursive-iterative/
public class InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode<Integer> root = createTree();
        preorder(root);
        invertRecursive(root);
        System.out.println();
        preorder(root);
        System.out.println("\n----- Iterative ------");
        root = createTree();
        invertIterative(root);
        preorder(root);
    }

    private static void invertRecursive(TreeNode<Integer> node) {

    }

    private static void invertIterative(TreeNode<Integer> node) {
    }


    public static void preorder(TreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        preorder(root.left);
        preorder(root.right);
    }

    private static TreeNode<Integer> createTree() {
        TreeNode<Integer> root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        return root;
    }
}
