package com.practice.ds.techiedelight.binarytree;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

// https://www.techiedelight.com/determine-given-binary-tree-is-subtree-of-another-binary-tree-not/
// Read the explanation FOR SURE.
public class CheckTreeIsSubtreeOfAnother {
    public static void main(String[] args) {

    }

    private static boolean isSubTree(TreeNode<Integer> node1, TreeNode<Integer> node2, boolean found) {
        return true;
    }

    private static BinaryTree<Integer> createTree() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        TreeNode<Integer> root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        return binaryTree;
    }

    private static BinaryTree<Integer> createSubTree() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        TreeNode<Integer> root = new TreeNode(3);
        root.left = new TreeNode(6);
        root.right = new TreeNode(7);

        return binaryTree;
    }
}
