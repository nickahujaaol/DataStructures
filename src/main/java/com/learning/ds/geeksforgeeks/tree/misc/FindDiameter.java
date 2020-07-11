package com.learning.ds.geeksforgeeks.tree.misc;

import apple.laf.JRSUIUtils;
import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;
import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

//https://www.geeksforgeeks.org/diameter-of-a-binary-tree/
public class FindDiameter {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = BinaryTree.create();

        int diameter = findDiameter(binaryTree.root);
        System.out.println(diameter);
    }

    private static int findDiameter(TreeNode<Integer> node) {
        int leftHeight = findHeight(node.left);
        int rightHeight = findHeight(node.right);
        return findHeight(node.left) + findHeight(node.right) + 1;
    }


    private static int findHeight(TreeNode<Integer> node) {
        if (node == null) return 0;
        int leftHeight = findHeight(node.left);
        int rightHeight = findHeight(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
