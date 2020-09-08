package com.practice.ds.geeksforgeeks.tree.traversals;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

//https://www.geeksforgeeks.org/boundary-traversal-of-binary-tree/
// Explanation https://java2blog.com/boundary-traversal-of-binary-tree-java/
public class BoundaryTraversal {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = BinaryTree.create();
        traverse(binaryTree.root);
    }

    private static void traverse(TreeNode<Integer> node) {
        traverseLeftBoundary(node);
        traverseLeaves(node);
        traverseRightBoundary(node.right);
    }

    private static void traverseLeftBoundary(TreeNode<Integer> node) {
        if(node == null || isLeaf(node))
            return;

        System.out.print(" "+ node.value);
        if(node.left != null)
            traverseLeftBoundary(node.left);
        else
            traverseLeftBoundary(node.right);
    }

    private static void traverseRightBoundary(TreeNode<Integer> node) {
        if(node == null || isLeaf(node))
            return;

        if(node.right != null)
            traverseLeftBoundary(node.right);
        else
            traverseLeftBoundary(node.left);
        System.out.print(" "+ node.value);
    }

    private static void traverseLeaves(TreeNode<Integer> node) {
        if(node == null)
            return;

        if(isLeaf(node))
            System.out.print(" "+ node.value);
        traverseLeaves(node.left);
        traverseLeaves(node.right);
    }

    private static boolean isLeaf(TreeNode<Integer> node) {
        return node != null && node.left == null && node.right == null ? true : false;
    }
}
