package com.template.ds.techiedelight.binarytree;

import com.learning.ds.TreeNode;

// https://www.techiedelight.com/find-ancestors-of-given-node-binary-tree/
// ANOTHER METHOD, FIND ROOT TO LEAF PATH...
public class FindAncestorsOfGivenNode {
    public static void main(String[] args) {
        TreeNode<Integer> root = createTree();
        findAncestors(root, 7);
    }

    private static boolean findAncestors(TreeNode<Integer> node, int nodeToFind) {
        return false;
    }

    private static TreeNode<Integer> createTree() {
        TreeNode<Integer> root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(7);
        root.right.right.right = new TreeNode(8);

        return root;
    }
}
