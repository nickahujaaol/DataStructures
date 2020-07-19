package com.template.ds.techiedelight.binarytree;

import com.learning.ds.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

// https://www.techiedelight.com/find-next-node-in-same-level-binary-tree/
public class FindNextNodeAtSameLevel {
    public static void main(String[] args) {
        TreeNode<Integer> nextNode = findNextNode(createTree(), 7);
        System.out.println("Next Node is : " + (nextNode != null ? nextNode.value : null));
    }

    private static TreeNode<Integer> findNextNode(TreeNode<Integer> node, int fromNode) {
        return null;
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
