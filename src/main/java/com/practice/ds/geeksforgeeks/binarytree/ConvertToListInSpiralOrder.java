package com.practice.ds.geeksforgeeks.binarytree;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

//https://www.techiedelight.com/convert-binary-tree-into-doubly-linked-list/
// READ THE EXPLANATION... IT IS GOOD :-)

public class ConvertToListInSpiralOrder {
    public static void main(String[] args) {
        convert(createTree().root);
    }

    private static void convert(TreeNode<Integer> node) {
    }

    private static BinaryTree<Integer> createTree() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();

        TreeNode<Integer> root = new TreeNode(1);
        binaryTree.root = root;

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        return binaryTree;
    }
}
