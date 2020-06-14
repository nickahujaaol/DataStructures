package com.learning.ds.geeksforgeeks.tree.traversals;


import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//https://www.geeksforgeeks.org/level-order-traversal-in-spiral-form/
public class LevelOrderInSpiralForm {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = BinaryTree.create();
        printSpiral(binaryTree.root);
    }

    private static void printSpiral(TreeNode<Integer> node) {
        Stack<TreeNode<Integer>> leftToRightStack = new Stack<>();
        Stack<TreeNode<Integer>> rightToLeftStack = new Stack();

        leftToRightStack.push(node);

        while (!leftToRightStack.isEmpty() || !rightToLeftStack.isEmpty()) {
            while (!leftToRightStack.isEmpty()) {
                TreeNode<Integer> tempNode = leftToRightStack.pop();
                System.out.print(" " + tempNode.value);
                if(tempNode.left != null) {
                    rightToLeftStack.push(tempNode.left);
                }
                if(tempNode.right != null) {
                    rightToLeftStack.push(tempNode.right);
                }
            }

            while (!rightToLeftStack.isEmpty()) {
                TreeNode<Integer> tempNode = rightToLeftStack.pop();
                System.out.print(" " + tempNode.value);
                if(tempNode.right != null) {
                    leftToRightStack.push(tempNode.right);
                }
                if(tempNode.left != null) {
                    leftToRightStack.push(tempNode.left);
                }
            }
        }
    }
}
