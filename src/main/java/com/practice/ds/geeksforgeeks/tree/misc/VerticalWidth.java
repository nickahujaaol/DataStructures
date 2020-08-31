package com.practice.ds.geeksforgeeks.tree.misc;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

//https://www.geeksforgeeks.org/width-binary-tree-set-1/
public class VerticalWidth {
    private static int minVal = 0;
    private static int maxVal = 0;

    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = BinaryTree.create();
        binaryTree.root.right.right.right.right = new TreeNode(15);
        findVerticalWidth(binaryTree.root, 0, 0);
        System.out.println("Width is : " + (maxVal - minVal));
    }

    private static void findVerticalWidth(TreeNode<Integer> node, int min, int max) {
        if (node == null) return;

        minVal = Math.min(minVal, min);
        maxVal = Math.max(maxVal, max);
        findVerticalWidth(node.left, min - 1, max);
        findVerticalWidth(node.right, min, max + 1);
    }
}
