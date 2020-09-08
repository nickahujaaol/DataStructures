package com.practice.ds.geeksforgeeks.tree.misc;


import apple.laf.JRSUIUtils;
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
        indexToValMap.put(0, node.value);
        nodeToIndexMap.put(node, 0);

        while (!queue.isEmpty()) {
            TreeNode<Integer> tempNode = queue.poll();
            System.out.println(tempNode.value);
            int parentNode = nodeToIndexMap.get(tempNode);
            if(tempNode.left != null) {
                queue.add(tempNode.left);
                indexToValMap.put(parentNode - 1, tempNode.left.value);
                nodeToIndexMap.put(tempNode.left, parentNode - 1);
            }
            if(tempNode.right != null) {
                queue.add(tempNode.right);
                indexToValMap.put(parentNode + 1, tempNode.right.value);
                nodeToIndexMap.put(tempNode.right, parentNode + 1);
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
