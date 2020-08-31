package com.practice.ds.geeksforgeeks.binarytree;

import com.learning.ds.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

// https://www.techiedelight.com/check-given-binary-tree-complete-binary-tree-not/
public class IsComplete {
    public static void main(String[] args) {
        TreeNode<Integer> root = createTree();
        boolean isComplete = isComplete(root);
        System.out.println("Is Complete Tree: " + isComplete);
    }

    private static boolean isComplete(TreeNode<Integer> node) {
        boolean isCompleteTree = true;
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            int qSize = queue.size();
            boolean leftOnlyStarted = false;
            for (int i = 0; i < qSize; i++) {
                TreeNode<Integer> tempNode = queue.poll();
                if (leftOnlyStarted && (tempNode.left != null || tempNode.right != null)) {
                    isCompleteTree = false;
                    break;
                }
                if (tempNode.left == null && tempNode.right != null) {
                    isCompleteTree = false;
                    break;
                }

                if (tempNode.left != null && tempNode.right == null) {
                    leftOnlyStarted = true;
                }

                if (tempNode.left != null) {
                    queue.add(tempNode.left);
                }
                if (tempNode.right != null) {
                    queue.add(tempNode.right);
                }
            }

            if (!isCompleteTree) {
                break;
            }
        }

        return isCompleteTree;
    }

    private static TreeNode<Integer> createTree() {
        TreeNode<Integer> root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);

        root.left.right.left = new TreeNode(10);
        //root.left.right.right = new TreeNode(11);
        root.right.left.left = new TreeNode(12);


        return root;
    }
}
