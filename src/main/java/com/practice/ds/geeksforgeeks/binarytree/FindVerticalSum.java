package com.practice.ds.geeksforgeeks.binarytree;

import com.learning.ds.TreeNode;

import java.util.HashMap;

// https://www.techiedelight.com/find-vertical-sum-given-binary-tree/
// JUST READ
public class FindVerticalSum {
    public static void main(String[] args) {
        TreeNode<Integer> root = createTree();
        HashMap<Integer, Integer> levelToSumMap = new HashMap<>();
        findSum(root, 0, levelToSumMap);
        System.out.println(levelToSumMap);
    }

    private static void findSum(TreeNode<Integer> node, int level, HashMap<Integer, Integer> levelToSumMap) {
        if (node == null) return;

        levelToSumMap.putIfAbsent(level, 0);
        levelToSumMap.replace(level, levelToSumMap.get(level) + node.value);
        findSum(node.left, level - 1, levelToSumMap);
        findSum(node.right, level + 1, levelToSumMap);
    }


    private static TreeNode<Integer> createTree() {
        TreeNode<Integer> root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(7);
        root.right.left.right = new TreeNode(8);

        return root;
    }
}
