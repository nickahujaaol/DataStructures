package com.template.ds.geeksforgeeks.tree.traversals;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

import java.util.HashMap;
import java.util.List;

//https://www.geeksforgeeks.org/diagonal-traversal-of-binary-tree/
public class DiagonalTraversal {
    public static void main(String[] args) {
        HashMap<Integer, List<Integer>> diagMap = new HashMap<>();
        BinaryTree binaryTree = BinaryTree.create();
        diagonalTraverse(binaryTree.root, diagMap, 1);
        System.out.println(diagMap);
    }

    private static void diagonalTraverse(TreeNode<Integer> node, HashMap<Integer, List<Integer>> diagMap, int diagonal) {

    }

    private static void addElement(TreeNode<Integer> node, HashMap<Integer, List<Integer>> diagMap, int diagonal) {

    }
}
