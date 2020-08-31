package com.practice.ds.geeksforgeeks.tree.misc;


import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

// https://www.geeksforgeeks.org/bottom-view-binary-tree/
public class BottomView {
    public static void main(String[] args) {
        HashMap<TreeNode<Integer>, Integer> nodeToIndexMap = new HashMap<>();
        HashMap<Integer, Integer> indexToValMap = new HashMap<>();
        printBottomView(createTree().root, nodeToIndexMap, indexToValMap);
        System.out.println(indexToValMap.values());
    }

    private static void printBottomView(TreeNode<Integer> node, HashMap<TreeNode<Integer>, Integer> nodeToIndexMap,
                                        HashMap<Integer, Integer> indexToValMap) {
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(node);
        nodeToIndexMap.put(node, 0);
        indexToValMap.put(0, node.value);

        while (!queue.isEmpty()) {
            TreeNode<Integer> tempNode = queue.poll();
            if (tempNode.left != null) {
                queue.add(tempNode.left);
                int parentLevel = nodeToIndexMap.get(tempNode);
                indexToValMap.put(parentLevel - 1, tempNode.left.value);
                nodeToIndexMap.put(tempNode.left, parentLevel - 1);
            }
            if (tempNode.right != null) {
                queue.add(tempNode.right);
                int parentLevel = nodeToIndexMap.get(tempNode);
                indexToValMap.put(parentLevel + 1, tempNode.right.value);
                nodeToIndexMap.put(tempNode.right, parentLevel + 1);
            }
        }
    }


    private static BinaryTree<Integer> createTree() {
        BinaryTree binaryTree = new BinaryTree();
        TreeNode root = new TreeNode(20);
        binaryTree.root = root;


        root.left = new TreeNode(8);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(14);

        root.right = new TreeNode(22);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(25);

        return binaryTree;
    }
}
