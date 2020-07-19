package com.learning.ds.techiedelight.binarytree;

import com.learning.ds.TreeNode;

import java.util.ArrayList;
import java.util.List;

// https://www.techiedelight.com/print-cousins-of-given-node-binary-tree/
public class PrintCousinsOfAGivenNode {
    public static void main(String[] args) {
        TreeNode<Integer> root = createTree();
        List<Integer> siblings = new ArrayList<>();
        getCousins(root, 6, siblings);
        System.out.println(siblings);
    }

    private static void getCousins(TreeNode<Integer> node, int ofNode, List<Integer> siblings) {
        int levelOfNode = getLevel(node, ofNode, 0);
        getNodesAtLevel(node, ofNode, siblings,  0, levelOfNode);
    }

    private static void getNodesAtLevel(TreeNode<Integer> node, int ofNode, List<Integer> siblings, int level, int atLevel) {
        if(node == null) return;

        if(atLevel == level) {
            siblings.add(node.value);
        }
        if(!hasSibling(node, ofNode)) {
            getNodesAtLevel(node.left, ofNode, siblings, level + 1, atLevel);
            getNodesAtLevel(node.right, ofNode, siblings, level + 1, atLevel);
        }

    }

    private static boolean hasSibling(TreeNode<Integer> node, int ofNode) {
        if(node != null) {
            if(node.left != null && node.left.value == ofNode) return true;
            if(node.right != null && node.right.value == ofNode) return true;
        }
        return false;
    }

    private static int getLevel(TreeNode<Integer> node, int ofNode, int level) {
        if(node == null) return 0;

        if(node.value == ofNode) return level;

        int leftLevel = getLevel(node.left, ofNode, level + 1);
        if(leftLevel > 0) return leftLevel;
        int rightLevel = getLevel(node.right, ofNode,level + 1);
        if(rightLevel > 0) return rightLevel;

        return level;
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
