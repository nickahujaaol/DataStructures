package com.practice.ds.techiedelight.binarytree;

import com.learning.ds.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

// https://www.techiedelight.com/find-maximum-width-given-binary-tree/
public class FindMaxWidth {
    public static void main(String[] args) {
        HashMap<Integer, Integer> nodeToLevelMap = new HashMap<>();
        findMaxWidthRecursive(createTree(), 0, nodeToLevelMap);
        //find max value now...
    }

    private static void findMaxWidthRecursive(TreeNode<Integer> node, int level, HashMap<Integer, Integer> nodeToLevelMap) {
        if(node == null)
            return;

        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(node);
        int maxWidth = Integer.MIN_VALUE;

        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            maxWidth = Math.max(maxWidth, queueSize);
            for(int i = 0; i < queueSize; i++) {
                TreeNode<Integer> tempNode = queue.poll();
                if(tempNode.left != null)
                    queue.add(tempNode.left);
                if(tempNode.right != null)
                    queue.add(tempNode.right);
            }
        }
        System.out.println("Max Width is: " + maxWidth);
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
