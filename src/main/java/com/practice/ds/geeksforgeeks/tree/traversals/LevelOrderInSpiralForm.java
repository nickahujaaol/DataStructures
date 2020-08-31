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

    private static void printSpiral(TreeNode<Integer> node) {
        Stack<TreeNode<Integer>> leftToRightStack = new Stack<>();
        Stack<TreeNode<Integer>> rightToLeftStack = new Stack<>();
        int level = 0;
        leftToRightStack.push(node);

        while (!leftToRightStack.isEmpty() || !rightToLeftStack.isEmpty()) {
            if (level % 2 == 0) {
                TreeNode<Integer> tempNode = leftToRightStack.pop();
                System.out.print(" " + tempNode.value);
                if (tempNode.left != null)
                    rightToLeftStack.push(tempNode.left);
                if (tempNode.right != null)
                    rightToLeftStack.push(tempNode.right);

                if (leftToRightStack.isEmpty()) level++;
            } else {
                TreeNode<Integer> tempNode = rightToLeftStack.pop();
                System.out.print(" " + tempNode.value);

                if (tempNode.right != null)
                    leftToRightStack.push(tempNode.right);
                if (tempNode.left != null)
                    leftToRightStack.push(tempNode.left);

                if (rightToLeftStack.isEmpty()) level++;
            }
        }

    }
}
