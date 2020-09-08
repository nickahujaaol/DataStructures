package com.practice.ds.geeksforgeeks.tree.traversals;


import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

import java.util.Stack;

//https://www.geeksforgeeks.org/level-order-traversal-in-spiral-form/
public class LevelOrderInSpiralForm {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = BinaryTree.create();
        printSpiral(binaryTree.root);
    }

    private static void printSpiral(TreeNode<Integer> node) {
        if(node == null)
            return;

        Stack<TreeNode<Integer>> leftToRightStack = new Stack<>();
        Stack<TreeNode<Integer>> rightToLeftStack = new Stack<>();
        leftToRightStack.push(node);

        while (!leftToRightStack.isEmpty() || !rightToLeftStack.isEmpty()) {
            if(!leftToRightStack.isEmpty()) {
                while (!leftToRightStack.isEmpty()) {
                    TreeNode<Integer> tempNode = leftToRightStack.pop();
                    System.out.print(" " + tempNode.value);
                    if (tempNode.left != null)
                        rightToLeftStack.push(tempNode.left);
                    if (tempNode.right != null)
                        rightToLeftStack.push((tempNode.right));
                }
            }

            if(!rightToLeftStack.isEmpty()) {
                while (!rightToLeftStack.isEmpty()) {
                    TreeNode<Integer> tempNode = rightToLeftStack.pop();
                    System.out.print(" " + tempNode.value);
                    if (tempNode.right != null)
                        leftToRightStack.push(tempNode.right);
                    if (tempNode.left != null)
                        leftToRightStack.push(tempNode.left);
                }
            }
        }
    }
}
