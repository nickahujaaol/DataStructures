package com.practice.ds.geeksforgeeks.binarytree;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

// https://www.techiedelight.com/calculate-height-binary-tree-iterative-recursive/
public class CalculateHeight {
    public static void main(String[] args) {
        int height = findHeight(createTree().root);
        System.out.println("Height is: " + height);
    }

    private static int findHeight(TreeNode<Integer> node) {
      return 0;
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

        return binaryTree;
    }
}
