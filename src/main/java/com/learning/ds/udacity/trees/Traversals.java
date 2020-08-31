package com.learning.ds.udacity.trees;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Traversals {
    /*
                                        8
                              /                 \
                            /                     \
                        4                           11
                      /    \                     /       \
                   2         6               9               13
                  /  \     /   \              \            /    \
                1     3   5      7               10      12      14
 */
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = BinaryTree.create();
        preOrder(binaryTree.root);
        inOrder(binaryTree.root);
        postOrder(binaryTree.root);
        System.out.println();
        levelOrder(binaryTree.root);
    }

    private static void preOrder(TreeNode node) {
        if (node == null) return;
        System.out.print(" " + node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    private static void inOrder(TreeNode node) {
        if (node == null) return;
        System.out.print(" " + node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    private static void postOrder(TreeNode node) {
        if (node == null) return;
        System.out.print(" " + node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    private static void levelOrder(TreeNode<Integer> node) {
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            TreeNode<Integer> tempNode = queue.remove();
            System.out.print(" " + tempNode.value);
            if (tempNode.left != null)
                queue.add(tempNode.left);
            if (tempNode.right != null)
                queue.add(tempNode.right);
        }
    }

}
