package com.practice.ds.geeksforgeeks.tree.misc;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

//https://www.geeksforgeeks.org/subtree-given-sum-binary-tree/
public class SubtreeWithGivenSum {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = BinaryTree.create();
        findSum(binaryTree.root, 6);
    }

    private static void findSum(TreeNode<Integer> node, int givenSum) {
        if (node == null) return;
        if (sum(node) == givenSum) {
            System.out.println("Sum found at node: " + node.value);
        }
        findSum(node.left, givenSum);
        findSum(node.right, givenSum);
    }

    private static int sum(TreeNode<Integer> node) {
        if (node == null) return 0;

        return node.value + sum(node.left) + sum(node.right);
    }
}
