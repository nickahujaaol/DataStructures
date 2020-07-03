package com.practice.ds.geeksforgeeks.tree.misc;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

//https://www.geeksforgeeks.org/kth-ancestor-node-binary-tree-set-2/
// SEE THE EXPLANATION ALSO :-)
public class KthAncestor {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = BinaryTree.create();
        binaryTree.root.right.right.right.right = new TreeNode(15);
        binaryTree.root.right.right.right.right.right = new TreeNode(16);

        findAncestor(binaryTree.root, 16, 4);
    }

    private static int findAncestor(TreeNode<Integer> node, int nodeValue, int kthAncestor) {

        return -1;
    }
}
