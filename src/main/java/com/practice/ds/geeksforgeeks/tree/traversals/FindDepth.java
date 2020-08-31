package com.practice.ds.geeksforgeeks.tree.traversals;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

// https://www.geeksforgeeks.org/calculate-depth-full-binary-tree-preorder/
public class FindDepth {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = BinaryTree.create();
        int depth = findDepth(binaryTree.root);
        System.out.println(depth);
    }

    private static int findDepth(TreeNode<Integer> node) {
        if (node == null) {
            return 0;
        }

        return Math.max(findDepth(node.left), findDepth(node.right)) + 1;

    }
}
