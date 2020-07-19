package com.learning.ds.techiedelight.binarytree;

import com.learning.ds.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(node);
        int level = 1;

        while (!queue.isEmpty()) {
            int qSize = queue.size();
            for(int i = 0; i < qSize; i++) {
                TreeNode<Integer> tempNode = queue.poll();
                levelToNodeMap.putIfAbsent(level, tempNode.value);
                if(tempNode.left != null)
                    queue.add(tempNode.left);
                if(tempNode.right != null)
                    queue.add(tempNode.right);
            }
            level++;
        }
    }

    private static void printRecursive(TreeNode<Integer> node, int level, HashMap<Integer, Integer> levelToNodeMap) {
        if(node == null) return;

        levelToNodeMap.putIfAbsent(level, node.value);
        printRecursive(node.left, level + 1, levelToNodeMap);
        printRecursive(node.right, level + 1, levelToNodeMap);
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
