package com.template.ds.geeksforgeeks.tree.traversals;

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

    }

    private static void traverseLeftBoundary(TreeNode<Integer> node) {

    }

    private static void traverseRightBoundary(TreeNode<Integer> node) {

    }

    private static void traverseLeaves(TreeNode<Integer> node) {

    }

    private static boolean isLeaf(TreeNode<Integer> node) {
        return node != null && node.left == null && node.right == null ? true : false;
    }
}
