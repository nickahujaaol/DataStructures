package com.practice.ds.geeksforgeeks.tree.misc;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

import java.util.concurrent.atomic.AtomicInteger;

//https://www.geeksforgeeks.org/find-maximum-path-sum-two-leaves-binary-tree/
// https://www.techiedelight.com/find-maximum-sum-path-between-two-leaves-in-a-binary-tree/
// READ THE EXPLANATION AND ALTERNATE METHODS
public class MaximumPathSum {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = createSumTree();
        AtomicInteger maxSum = new AtomicInteger(Integer.MIN_VALUE);
        findMaxSumPath(binaryTree.root, maxSum);
        System.out.println(maxSum.get());
    }

    /*
    Atomic Integer holds the max value so far which is Left side + node value + right side
    The return value of the method is the max path value from leaf to the given node.
     */
    private static int findMaxSumPath(TreeNode<Integer> node, AtomicInteger maxSum) {
        return 0;
    }



    private static BinaryTree createSumTree() {
        BinaryTree tree = new BinaryTree();
        TreeNode root = new TreeNode(-15);
        tree.root = root;

        root.left = new TreeNode(5);
        root.left.right = new TreeNode(2);
        root.left.left = new TreeNode(-7);
        root.left.left.left = new TreeNode(2);
        root.left.left.right = new TreeNode(6);

        root.right = new TreeNode(6);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(9);
        root.right.right.right = new TreeNode(0);
        root.right.right.right.left = new TreeNode(4);
        root.right.right.right.right = new TreeNode(-1);
        root.right.right.right.right.left = new TreeNode(10);

        return tree;
    }
}
