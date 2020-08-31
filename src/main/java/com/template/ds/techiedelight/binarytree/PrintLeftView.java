package com.template.ds.techiedelight.binarytree;

import com.learning.ds.TreeNode;

import java.util.HashMap;

// https://www.techiedelight.com/print-left-view-of-binary-tree/
public class PrintLeftView {
    public static void main(String[] args) {
        TreeNode<Integer> root = createTree();
        HashMap<Integer, Integer> levelToNodeMap = new HashMap<>();
        printRecursive(root, 1, levelToNodeMap);
        System.out.println(levelToNodeMap);

        levelToNodeMap = new HashMap<>();
        printIterative(root, levelToNodeMap);
        System.out.println("Iterative: " + levelToNodeMap);
    }

    private static void printIterative(TreeNode<Integer> node, HashMap<Integer, Integer> levelToNodeMap) {

    }

    private static void printRecursive(TreeNode<Integer> node, int level, HashMap<Integer, Integer> levelToNodeMap) {

    }

    private static TreeNode<Integer> createTree() {
        TreeNode<Integer> root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(7);
        root.right.left.right = new TreeNode(8);

        return root;
    }
}
