package com.practice.ds.geeksforgeeks.tree.check;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

//https://www.geeksforgeeks.org/check-if-a-given-binary-tree-is-sumtree/
public class SumTree {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = createSumTree();
        boolean isSumTree = isSumTree(binaryTree.root);
        System.out.println(isSumTree);
    }

    private static boolean isSumTree(TreeNode<Integer> node) {
        return false;
    }

    private static int sum(TreeNode<Integer> node) {
        return 0;
    }

    private static BinaryTree createSumTree() {
        BinaryTree tree = new BinaryTree();
        TreeNode root = new TreeNode(26);
        tree.root = root;

        root.left = new TreeNode(10);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(6);

        root.right = new TreeNode(3);
        root.right.right = new TreeNode(3);

        return tree;
    }
}
