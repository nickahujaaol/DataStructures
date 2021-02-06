package com.practice.ds.geeksforgeeks.tree.check;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

import java.util.ArrayList;
import java.util.List;

//https://www.geeksforgeeks.org/given-a-binary-tree-print-out-all-of-its-root-to-leaf-paths-one-per-line/
public class RootToLeafPaths {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = BinaryTree.create();
        List<TreeNode<Integer>> pathsList = new ArrayList<>();
        getPaths(binaryTree.root, pathsList);
    }

    private static void getPaths(TreeNode<Integer> node, List<TreeNode<Integer>> pathsList) {

    }
}
