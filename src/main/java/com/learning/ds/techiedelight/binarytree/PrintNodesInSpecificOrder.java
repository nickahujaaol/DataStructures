package com.learning.ds.techiedelight.binarytree;

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
        System.out.print(" " + node.value);
        leftToRightQ.add(node.left);
        rightToLeftQ.add(node.right);

        while (!leftToRightQ.isEmpty()) {
            TreeNode<Integer> leftTempNode = leftToRightQ.poll();
            System.out.print(" " + leftTempNode.value);
            if (leftTempNode.left != null)
                leftToRightQ.add(leftTempNode.left);
            if (leftTempNode.right != null)
                leftToRightQ.add(leftTempNode.right);

            TreeNode<Integer> rightTempNode = rightToLeftQ.poll();
            System.out.print(" " + rightTempNode.value);
            if (rightTempNode.right != null)
                rightToLeftQ.add(rightTempNode.right);
            if (rightTempNode.left != null)
                rightToLeftQ.add(rightTempNode.left);
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
