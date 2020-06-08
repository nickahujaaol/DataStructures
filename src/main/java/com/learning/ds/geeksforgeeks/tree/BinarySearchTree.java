package com.learning.ds.geeksforgeeks.tree;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

public class BinarySearchTree {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = BinaryTree.create();
        int result = searchIterative(binaryTree.root, 113);
        System.out.println(result);

        result = searchRecursive(binaryTree.root, 113);
        System.out.println(result);

        insertIterative(binaryTree.root, 15);
        preOrder(binaryTree.root);
    }

    private static void insertIterative(TreeNode<Integer> root, int numToInsert) {
        TreeNode<Integer> currNode = root;
        while (currNode != null) {
            if (currNode.left == null && currNode.value > numToInsert) {
                currNode.left = new TreeNode<Integer>(numToInsert);
            } else if (currNode.right == null && currNode.value < numToInsert) {
                currNode.right = new TreeNode<Integer>(numToInsert);
            }

            if (currNode.value > numToInsert) {
                currNode = currNode.left;
            } else {
                currNode = currNode.right;
            }
        }
    }

    private static int searchRecursive(TreeNode<Integer> node, int numToSearch) {
        if(node == null) return -1;
        if(node.value == numToSearch) {
            return 1;
        }
        if(node.value > numToSearch) {
            return searchRecursive(node.left, numToSearch);
        } else {
            return searchRecursive(node.right, numToSearch);
        }
    }

    private static int searchIterative(TreeNode<Integer> root, int numToSearch) {
        TreeNode<Integer> currNode = root;
        while(currNode != null) {
            if(currNode.value > numToSearch) {
                currNode = currNode.left;
            } else if(currNode.value < numToSearch) {
                currNode = currNode.right;
            } else {
                return 1;
            }
        }
        return -1;
    }

    private static void preOrder(TreeNode node) {
        if(node == null) return;
        System.out.print(" " + node.value);
        preOrder(node.left);
        preOrder(node.right);
    }
}
