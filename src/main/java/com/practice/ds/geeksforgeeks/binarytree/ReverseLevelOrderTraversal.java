package com.practice.ds.geeksforgeeks.binarytree;

import com.learning.ds.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// https://www.techiedelight.com/reverse-level-order-traversal-binary-tree/
// USe hashing with levels or use Level Order with Stack
public class ReverseLevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode<Integer> root = createTree();
        reverse(root);
    }

    private static void reverse(TreeNode<Integer> node) {
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            TreeNode<Integer> tempNode = queue.poll();
            stack.push(tempNode.value);
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(" " + stack.pop());
        }
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
