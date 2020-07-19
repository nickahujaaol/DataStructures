package com.practice.ds.geeksforgeeks.tree.check;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

//https://www.geeksforgeeks.org/check-two-nodes-cousins-binary-tree/
public class TwoNodesAreCousins {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = BinaryTree.create();
        findCousinsRecursive(binaryTree.root, 1, 3, Integer.MIN_VALUE);
    }

    private static void findCousinsRecursive(TreeNode<Integer> node, int num1, int num2, int level) {
        if(!isSibling(node, num1, num2) &&
            getLevel(node, num1, level) == getLevel(node, num2, level)) {
            System.out.println("Nodes are Cousins");
        } else {
            System.out.println("Nodes are not cousins");
        }
    }

    private static int getLevel(TreeNode<Integer> node, int num, int level) {
        if(node == null) return Integer.MIN_VALUE;

        if(node != null && node.value == num) {
            return level;
        }

        int tempLevel = getLevel(node.left, num, level + 1);
        if(tempLevel != Integer.MIN_VALUE) {
            return tempLevel;
        } else
            return getLevel(node.right, num, level + 1);
    }

    private static boolean isSibling(TreeNode<Integer> node, int num1, int num2) {
        if(node == null) return false;
        System.out.println(node);
        if(node.left!= null && node.right != null &&
                ((node.left.value == num1 && node.right.value == num2) ||
                        (node.right.value == num1 && node.left.value == num2))) {
            return true;
        }
        return isSibling(node.left, num1, num2) || isSibling(node.right, num1, num2);
    }

}
