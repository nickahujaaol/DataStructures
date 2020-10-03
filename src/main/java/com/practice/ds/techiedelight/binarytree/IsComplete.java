package com.practice.ds.techiedelight.binarytree;

import com.learning.ds.TreeNode;

// https://www.techiedelight.com/check-given-binary-tree-complete-binary-tree-not/
public class IsComplete {
    public static void main(String[] args) {
        TreeNode<Integer> root = createTree();
        boolean isComplete = isComplete(root);
        System.out.println("Is Complete Tree: " + isComplete);
    }

    private static boolean isComplete(TreeNode<Integer> node) {


        return false;
    }

    private static TreeNode<Integer> createTree() {
        TreeNode<Integer> root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);

        root.left.right.left = new TreeNode(10);
        //root.left.right.right = new TreeNode(11);
        root.right.left.left = new TreeNode(12);


        return root;
    }
}
