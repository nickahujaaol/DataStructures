package com.finalprep.binarytree;

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
