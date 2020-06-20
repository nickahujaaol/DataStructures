package com.learning.ds.geeksforgeeks.tree.misc;

import apple.laf.JRSUIUtils;
import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;
import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

//https://www.geeksforgeeks.org/diameter-of-a-binary-tree/
public class FindDiameter {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = BinaryTree.create();
        binaryTree.root.right = null;

        int diameter = findDiameter(binaryTree.root);
        System.out.println(diameter);
    }

    private static int findDiameter(TreeNode<Integer> node) {
        if(node == null)
            return 0;

        int leftHeight = findHeight(node.left);
        int rightHeight = findHeight(node.right);
        int diameter = leftHeight + rightHeight + 1;

        return Math.max(Math.max(findDiameter(node.left), findDiameter(node.right)),
                diameter);
    }


    private static int findHeight(TreeNode<Integer> node) {
        if(node == null)
            return 0;
        return 1 + Math.max(findHeight(node.left), findHeight(node.right));
    }
}
