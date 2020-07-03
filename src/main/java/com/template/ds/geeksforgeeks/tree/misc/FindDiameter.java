package com.template.ds.geeksforgeeks.tree.misc;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

//https://www.geeksforgeeks.org/diameter-of-a-binary-tree/
public class FindDiameter {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = BinaryTree.create();
        binaryTree.root.right = null;

        int diameter = findDiameter(binaryTree.root);
        System.out.println(diameter);
    }

    private static int findDiameter(TreeNode<Integer> node) {
        return 0;
    }


    private static int findHeight(TreeNode<Integer> node) {
        return 0;
    }
}
