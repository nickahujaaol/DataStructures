package com.learning.ds.geeksforgeeks.tree.traversals;

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
        reverse(binaryTree.root);
        System.out.println();
        printLevelOrder(binaryTree.root);
    }

    private static void reverse(TreeNode<Integer> node) {
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(node);
        int levelNumber = 0;
        boolean isOddLevel = false;
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            levelNumber++;
            isOddLevel = levelNumber % 2 == 1 ? true : false;
            Stack<Integer> tempStack = new Stack<>();


            for (int i = 0; i < queueSize; i++) {
                TreeNode<Integer> tempNode = queue.remove();
                if (tempNode.left != null) {
                    queue.add(tempNode.left);
                    if (isOddLevel)
                        tempStack.push(tempNode.left.value);
                }
                if (tempNode.right != null) {
                    queue.add(tempNode.right);
                    if (isOddLevel)
                        tempStack.push(tempNode.right.value);
                }
            }

            if (isOddLevel) {
                int stackSize = tempStack.size();
                for (int i = 0; i < stackSize; i++) {
                    int stackValue = tempStack.pop();
                    TreeNode<Integer> treeNodeQueue = queue.remove();
                    treeNodeQueue.value = stackValue;
                    queue.add(treeNodeQueue);
                }
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
