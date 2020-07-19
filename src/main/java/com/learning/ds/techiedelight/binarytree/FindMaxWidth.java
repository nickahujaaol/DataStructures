package com.learning.ds.techiedelight.binarytree;

import com.learning.ds.TreeNode;

import java.util.Comparator;
import java.util.HashMap;

// https://www.techiedelight.com/find-maximum-width-given-binary-tree/
public class FindMaxWidth {
    public static void main(String[] args) {
        HashMap<Integer, Integer> nodeToLevelMap = new HashMap<>();
        findMaxWidthRecursive(createTree(), 0, nodeToLevelMap);
        //find max value now...
    }

    private static void findMaxWidthRecursive(TreeNode<Integer> node, int level, HashMap<Integer, Integer> nodeToLevelMap) {
        if(node == null) return;

        nodeToLevelMap.put(node.value, level);
        findMaxWidthRecursive(node.left, level + 1, nodeToLevelMap);
        findMaxWidthRecursive(node.right, level + 1, nodeToLevelMap);
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
