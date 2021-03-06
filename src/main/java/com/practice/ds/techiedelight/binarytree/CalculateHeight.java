package com.practice.ds.techiedelight.binarytree;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

// https://www.techiedelight.com/calculate-height-binary-tree-iterative-recursive/
public class CalculateHeight {
    public static void main(String[] args) {
        int height = findHeight(createTree().root);
        System.out.println("Height is: " + height);
    }

    private static int findHeight(TreeNode<Integer> node) {
        if(node == null)
            return 0;

        int leftHeight = findHeight(node.left);
        int rightHeight = findHeight(node.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }


    private static BinaryTree<Integer> createTree() {
        BinaryTree binaryTree = new BinaryTree();
        TreeNode root = new TreeNode(15);
        binaryTree.root = root;

        root.left = new TreeNode(10);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(12);
        root.right.left = new TreeNode(16);
        root.right.right = new TreeNode(25);
        root.right.right.right = new TreeNode(26);

        return binaryTree;
    }
}
