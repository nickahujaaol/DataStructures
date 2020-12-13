package com.practice.ds.techiedelight.binarytree;

import com.learning.ds.TreeNode;

import java.util.HashMap;

// https://www.techiedelight.com/find-diagonal-sum-given-binary-tree/
public class FindDiagonalSum {
    public static void main(String[] args) {
        HashMap<Integer, Integer> diagonalMap = new HashMap();
        findDiagonal(createTree(), diagonalMap, 0);
        System.out.println(diagonalMap);
    }

    private static void findDiagonal(TreeNode<Integer> node, HashMap<Integer, Integer> diagonalMap, int level) {
        if(node == null)
            return;

        diagonalMap.put(level, diagonalMap.getOrDefault(level, 0) + node.value);
        findDiagonal(node.right, diagonalMap, level);
        findDiagonal(node.left, diagonalMap, level + 1);
    }

    private static TreeNode<Integer> createTree() {
        TreeNode<Integer> root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(7);
        root.right.left.right = new TreeNode(8);

        return root;
    }
}
