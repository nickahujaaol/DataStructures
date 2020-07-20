package com.practice.ds.geeksforgeeks.binarytree;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

// https://www.techiedelight.com/determine-two-nodes-are-cousins/
public class Check2NodesAreCousins {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = createTree();
        System.out.println("Are Cousins: " + areCousins(binaryTree.root, 5, 4));
    }

    private static boolean areCousins(TreeNode<Integer> node, int num1, int num2) {
        return false;
    }


    private static BinaryTree<Integer> createTree() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        TreeNode<Integer> root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        binaryTree.root = root;
        return binaryTree;
    }
}
