package com.practice.ds.geeksforgeeks.tree.check;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

//https://www.geeksforgeeks.org/check-two-nodes-cousins-binary-tree/
public class TwoNodesAreCousins {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = BinaryTree.create();
        findCousins(binaryTree.root, 1, 7);
    }

    private static void findCousins(TreeNode<Integer> node, int num1, int num2) {
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            boolean firstNumFound = false;
            boolean secondNumFound = false;

            for(int i = 0; i < queueSize; i++) {
                TreeNode<Integer> removedNode = queue.remove();
                if(hasSibling(removedNode, num1, num2)) {
                    System.out.println("Numbers are Siblings....");
                    return;
                }
                if (removedNode.value == num1) {
                    firstNumFound = true;
                }
                if (removedNode.value == num2) {
                    secondNumFound = true;
                }

                if(removedNode.left != null) {
                    queue.add(removedNode.left);
                }

                if(removedNode.right != null) {
                    queue.add(removedNode.right);
                }
            }

            if(firstNumFound && secondNumFound){
                System.out.println("Numbers are Cousins...");
            }
        }
    }

    private static boolean hasSibling(TreeNode<Integer> node, int num1, int num2) {
        if(node.left != null && node.right != null) {
            if((node.left.value == num1 && node.right.value == num2) ||
                    (node.right.value == num1 && node.left.value == num2)) {
                return true;
            }
        }

        return false;
    }
}
