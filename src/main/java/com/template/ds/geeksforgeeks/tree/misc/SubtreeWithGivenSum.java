package com.template.ds.geeksforgeeks.tree.misc;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

//https://www.geeksforgeeks.org/subtree-given-sum-binary-tree/
public class SubtreeWithGivenSum {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = BinaryTree.create();
        findSum(binaryTree.root, 6);
    }

    private static void findSum(TreeNode<Integer> node, int givenSum) {

    }

    private static int sum(TreeNode<Integer> node) {
        return 0;
    }
}
