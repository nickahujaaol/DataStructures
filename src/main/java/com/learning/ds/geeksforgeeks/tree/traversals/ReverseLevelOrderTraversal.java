package com.learning.ds.geeksforgeeks.tree.traversals;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//https://www.geeksforgeeks.org/reverse-level-order-traversal/
// JUST READ THE EXPLANATION. GOOD ENOUGH
public class ReverseLevelOrderTraversal {
    public static void main(String[] args) {
        BinaryTree tree = BinaryTree.create();
        print(tree.root);
    }

    private static void print(TreeNode<Integer> node) {
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        queue.add(node);


        while (!queue.isEmpty()) {
            TreeNode<Integer> tempNode = queue.poll();
            stack.add(tempNode.value);
            if(tempNode.left != null) {
                queue.add(tempNode.left);
            }
            if(tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(" " + stack.pop());
        }
    }
}
