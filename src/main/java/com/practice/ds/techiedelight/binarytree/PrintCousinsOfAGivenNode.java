package com.practice.ds.techiedelight.binarytree;

import com.learning.ds.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// https://www.techiedelight.com/print-cousins-of-given-node-binary-tree/
/*
The idea is to find level of given node in binary tree by doing a
pre-order traversal of the tree. Once the level is found,
we print all nodes present in that level which is not sibling of given node or the node itself.</p>
 */
public class PrintCousinsOfAGivenNode {
    public static void main(String[] args) {
        TreeNode<Integer> root = createTree();
        List<Integer> siblings = new ArrayList<>();
        getCousins(root, 6, siblings);
        System.out.println(siblings);
    }

    private static void getCousins(TreeNode<Integer> node, int ofNode, List<Integer> siblings) {
        int level = getLevel(node, 6, 0);
        getNodesAtLevel(node, 6, siblings, 0, level);
    }

    private static void getNodesAtLevel(TreeNode<Integer> node, int ofNode, List<Integer> siblings, int level, int atLevel) {
        if(node == null)
            return;
        if(level == atLevel)
            siblings.add(node.value);
        if(!hasSiblings(node, ofNode))
            getNodesAtLevel(node.left, ofNode, siblings, level + 1, atLevel);
        if(!hasSiblings(node, ofNode))
            getNodesAtLevel(node.right, ofNode, siblings, level + 1, atLevel);
    }

    private static boolean hasSiblings(TreeNode<Integer> node, int childNode) {
        if(node != null && (node.left != null && node.left.value == childNode) ||
                (node.right != null && node.right.value == childNode)) {
            return true;
        }
        return false;
    }

    private static int getLevel(TreeNode<Integer> node, int ofNode, int level) {
        if(node == null)
            return 0;

        if(node.value == ofNode)
            return level;
        int leftLevel = getLevel(node.left, ofNode, level + 1);
        if(leftLevel > 0)
            return leftLevel;
        int rightLevel = getLevel(node.right, ofNode, level + 1);
        if(rightLevel > 0)
            return rightLevel;

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
