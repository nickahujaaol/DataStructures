package com.practice.ds.geeksforgeeks.tree.traversals;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//https://www.geeksforgeeks.org/reverse-alternate-levels-binary-tree/

/**
 * 1 - We need to access values at each level and need to track what values are there in each level.
 * At any given time, the values in queue will be values at some level. Store the size in a variable.
 * Run the variable till that limit and you will get values at that level
 * 8 - queue size is 1
 * 4, 11 - queue size is 2
 */
public class ReverseAlternateLevelsOfPerfectBinaryTree {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = BinaryTree.create();

        printLevelOrder(binaryTree.root);
        System.out.println();
        reverse(binaryTree.root);
        System.out.println();
        printLevelOrder(binaryTree.root);
    }

    private static void reverse(TreeNode<Integer> node) {
        if(node == null)
            return;

        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            int queueSize = queue.size();

            Stack<Integer> stack = new Stack<>();
            for(int i = 0; i < queueSize; i++) {
                TreeNode<Integer> tempNode = queue.poll();
                if(tempNode.left != null) {
                    queue.add(tempNode.left);
                    stack.push(tempNode.left.value);
                }
                if(tempNode.right != null) {
                    queue.add(tempNode.right);
                    stack.push(tempNode.right.value);
                }
            }

            while (!stack.isEmpty()) {
                int poppedValue = stack.pop();
                TreeNode<Integer> tempNode = queue.poll();
                tempNode.value = poppedValue;
                queue.add(tempNode);
            }
        }
    }

    private static void printLevelOrder(TreeNode<Integer> node) {
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
