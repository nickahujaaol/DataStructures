package com.template.ds.techiedelight.binarytree;

import com.learning.ds.TreeNode;

// https://www.techiedelight.com/find-lowest-common-ancestor-lca-two-nodes-binary-tree/
// READ THE EXPLANATION ALSO ***

/**
 * Find in either left or right tree. If found in both, the print LCA
 * if found in only left or right, check if current node is also part of the same side.
 */
public class FindLCAOf2Nodes {
    public static void main(String[] args) {
        findLCA(createTree(), 7, 4);
    }

    private static boolean findLCA(TreeNode<Integer> node, int node1, int node2) {
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
