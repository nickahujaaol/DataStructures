package com.practice.ds.geeksforgeeks.binarytree;

import com.learning.ds.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

// https://www.techiedelight.com/print-nodes-binary-tree-specific-order/
public class PrintNodesInSpecificOrder {
    public static void main(String[] args) {
        TreeNode<Integer> root = createTree();
        printNodes(root);
    }

    private static void printNodes(TreeNode<Integer> node) {
        Queue<TreeNode<Integer>> leftToRightQ = new LinkedList<>();
        Queue<TreeNode<Integer>> rightToLeftQ = new LinkedList<>();
        System.out.print(node.value);
        leftToRightQ.add(node.left);
        rightToLeftQ.add(node.right);

        while (!leftToRightQ.isEmpty() && !rightToLeftQ.isEmpty()) {
            int leftQSize = leftToRightQ.size();
            for (int i = 0; i < leftQSize; i++) {
                TreeNode<Integer> leftTempQ = leftToRightQ.poll();
                TreeNode<Integer> rightTempQ = rightToLeftQ.poll();
                System.out.print(" " + leftTempQ.value);
                System.out.print(" " + rightTempQ.value);

                if (leftTempQ.left != null)
                    leftToRightQ.add(leftTempQ.left);
                if (leftTempQ.right != null)
                    leftToRightQ.add(leftTempQ.right);


                if (rightTempQ.right != null)
                    rightToLeftQ.add(rightTempQ.right);
                if (rightTempQ.left != null)
                    rightToLeftQ.add(rightTempQ.left);
            }
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
        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(11);
        root.right.left.left = new TreeNode(12);
        root.right.left.right = new TreeNode(13);
        root.right.right.left = new TreeNode(14);
        root.right.right.right = new TreeNode(15);

        return root;
    }
}
