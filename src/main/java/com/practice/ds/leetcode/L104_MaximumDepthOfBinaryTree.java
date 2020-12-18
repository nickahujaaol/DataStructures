package com.practice.ds.leetcode;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

public class L104_MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode<Integer> root = BinaryTree.create().root;
        root.left.left.left.left = new TreeNode(0);
        int depth = findDepth(root);
        System.out.println(depth);
    }

    private static int findDepth(TreeNode<Integer> node) {
        return 0;
    }
}
