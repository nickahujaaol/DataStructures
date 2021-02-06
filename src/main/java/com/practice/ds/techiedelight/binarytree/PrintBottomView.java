package com.practice.ds.techiedelight.binarytree;

import com.learning.ds.TreeNode;

import java.util.HashMap;

// https://www.techiedelight.com/print-bottom-view-of-binary-tree/
public class PrintBottomView {
    private static HashMap<Integer, Integer> viewMap = new HashMap<>();
    public static void main(String[] args) {
        printBottomView(createTree(), 0);
        System.out.println(viewMap);
    }

    private static void printBottomView(TreeNode<Integer> node, int level) {
        if(node == null)
            return;

        viewMap.put(level, node.value);
        printBottomView(node.left, level - 1);
        printBottomView(node.right, level + 1);
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
