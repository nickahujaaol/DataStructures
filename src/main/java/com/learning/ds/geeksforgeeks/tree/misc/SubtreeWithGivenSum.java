package com.learning.ds.geeksforgeeks.tree.misc;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

//https://www.geeksforgeeks.org/subtree-given-sum-binary-tree/
public class SubtreeWithGivenSum {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = BinaryTree.create();
        findSum(binaryTree.root, 28);
    }

    private static int findSum(TreeNode<Integer> node, int givenSum) {
        if(node == null)
            return 0;
        int leftSum = findSum(node.left, givenSum);
        int rightSum = findSum(node.right, givenSum);
        int sumAtThisNode = node.value + leftSum + rightSum;
        if(sumAtThisNode == givenSum) {
            System.out.println("Sum found at Tree node: " + node.value);
        }
        return sumAtThisNode;
    }

    private static void findSum_NOT_GOOD(TreeNode<Integer> node, int givenSum) {
        if (node == null)
            return;

        int nodeSum = sum(node);
        if (nodeSum == givenSum) {
            System.out.println("Given sum exists for node with Parent: " + node.value);
        }
        findSum(node.left, givenSum);
        findSum(node.right, givenSum);
    }

    private static int sum(TreeNode<Integer> node) {
        if (node == null)
            return 0;
        return node.value + sum(node.left) + sum(node.right);
    }
}
