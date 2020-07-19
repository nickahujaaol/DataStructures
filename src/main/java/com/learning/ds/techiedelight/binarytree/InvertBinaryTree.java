package com.learning.ds.techiedelight.binarytree;

import com.learning.ds.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// https://www.techiedelight.com/invert-binary-tree-recursive-iterative/
public class InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode<Integer> root = createTree();
        preorder(root);
        invertRecursive(root);
        System.out.println();
        preorder(root);
        System.out.println("\n----- Iterative ------");
        root = createTree();
        invertIterative(root);
        preorder(root);
    }

    private static void invertRecursive(TreeNode<Integer> node) {
        if(node == null) return;

        swap(node);
        invertRecursive(node.left);
        invertRecursive(node.right);
    }

    private static void invertIterative(TreeNode<Integer> node) {
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            int qSize = queue.size();
            /*
            MAKE SURE YOU USE VALUE IN STACK, IF YOU USE NODE, THEN REFERENCE VALUES MAY GET CORRUPT.
             */
            Stack<Integer> tempStack = new Stack<>();
            for(int i = 0; i < qSize; i++) {
                TreeNode<Integer> tempNode = queue.poll();
                if (tempNode.left != null) {
                    queue.add(tempNode.left);
                    tempStack.push(tempNode.left.value);
                } if(tempNode.right != null) {
                    queue.add(tempNode.right);
                    tempStack.push(tempNode.right.value);
                }
            }

            int stackSize = tempStack.size();
            for(int i = 0; i < stackSize; i++) {
                TreeNode<Integer> tempNode = queue.poll();
                tempNode.value = tempStack.pop();
                queue.add(tempNode);
            }
        }
    }

    private static void swap(TreeNode<Integer> node) {
        TreeNode<Integer> tempNode = node.left;
        node.left = node.right;
        node.right = tempNode;
    }

    public static void preorder(TreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        preorder(root.left);
        preorder(root.right);
    }

    private static TreeNode<Integer> createTree() {
        TreeNode<Integer> root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        return root;
    }
}
