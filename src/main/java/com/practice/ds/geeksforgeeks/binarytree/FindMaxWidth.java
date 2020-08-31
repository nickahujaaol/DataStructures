package com.practice.ds.geeksforgeeks.binarytree;

import com.learning.ds.TreeNode;

import java.util.HashMap;

// https://www.techiedelight.com/find-maximum-width-given-binary-tree/
public class FindMaxWidth {
    public static void main(String[] args) {
        HashMap<Integer, Integer> levelToNumMap = new HashMap<>();
        findMaxWidthRecursive(createTree(), 0, levelToNumMap);
        System.out.println(levelToNumMap);
        //find max value now...
    }

    private static void findMaxWidthRecursive(TreeNode<Integer> node, int level, HashMap<Integer, Integer> levelToNumMap) {
        if (node == null) return;

        levelToNumMap.putIfAbsent(level, 0);
        levelToNumMap.replace(level, levelToNumMap.get(level) + 1);
        findMaxWidthRecursive(node.left, level + 1, levelToNumMap);
        findMaxWidthRecursive(node.right, level + 1, levelToNumMap);
    }

    private static TreeNode<Integer> createTree() {
        TreeNode<Integer> root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        return root;
    }
}
