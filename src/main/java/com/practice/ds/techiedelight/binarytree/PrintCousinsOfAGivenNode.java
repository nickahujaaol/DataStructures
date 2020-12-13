package com.practice.ds.techiedelight.binarytree;

import com.learning.ds.TreeNode;

import java.util.ArrayList;
import java.util.List;

// https://www.techiedelight.com/print-cousins-of-given-node-binary-tree/
public class PrintCousinsOfAGivenNode {
    public static void main(String[] args) {
        TreeNode<Integer> root = createTree();
        List<Integer> siblings = new ArrayList<>();
        System.out.println(getLevel(root, 6, 0));
        getCousins(root, 6, siblings);
        System.out.println(siblings);
    }

    private static void getCousins(TreeNode<Integer> node, int ofNode, List<Integer> siblings) {
        int level = getLevel(node, ofNode, 0);
        getNodesAtLevel(node, ofNode, 0, level, siblings);
    }

    private static void getNodesAtLevel(TreeNode<Integer> node, int ofNode, int level, int atevel,  List<Integer> siblings) {
        if(node == null)
            return;

        if(!hasSibling(node, ofNode)) {
            if(level == atevel)
                siblings.add(node.value);

            getNodesAtLevel(node.left, ofNode, level + 1, atevel, siblings);
            getNodesAtLevel(node.right, ofNode, level + 1, atevel, siblings);
        }
    }

    private static boolean hasSibling(TreeNode<Integer> node, int ofNode) {
        if(node != null && node.left != null && node.right != null && (node.left.value == ofNode || node.right.value == ofNode))
            return true;
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

        return 0;
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
