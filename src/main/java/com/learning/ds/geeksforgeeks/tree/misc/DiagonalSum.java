package com.learning.ds.geeksforgeeks.tree.misc;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;

// https://www.geeksforgeeks.org/diagonal-sum-binary-tree/
// JUST READ THE SOLUTION
public class DiagonalSum {
    public static void main(String[] args) {
        HashMap<Integer, ArrayList<Integer>> diagonalToListMap = new HashMap<>();
        printDiagonals(createTree().root, diagonalToListMap, 0);
        System.out.println(diagonalToListMap);
    }

    private static void printDiagonals(TreeNode<Integer> node,
                                       HashMap<Integer, ArrayList<Integer>> diagonalToListMap,
                                       int diagonal) {
        if (node == null) return;

        diagonalToListMap.putIfAbsent(diagonal, new ArrayList<Integer>());
        diagonalToListMap.get(diagonal).add(node.value);
        printDiagonals(node.left, diagonalToListMap, diagonal - 1);
        printDiagonals(node.right, diagonalToListMap, diagonal);
    }


    private static BinaryTree<Integer> createTree() {
        BinaryTree binaryTree = new BinaryTree();
        TreeNode root = new TreeNode(1);
        binaryTree.root = root;


        root.left = new TreeNode(2);
        root.left.left = new TreeNode(9);
        root.left.left.right = new TreeNode(10);

        root.left.right = new TreeNode(6);
        root.left.right.left = new TreeNode(11);

        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.left.left = new TreeNode(12);
        root.right.left.right = new TreeNode(7);

        root.right.right = new TreeNode(5);

        return binaryTree;
    }
}
