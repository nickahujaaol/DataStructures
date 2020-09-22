package com.practice.ds.techiedelight.binarytree;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

// https://www.techiedelight.com/inplace-convert-a-tree-sum-tree/
public class ConvertBinaryTreeToSumTree {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = createTree();
        preorder(binaryTree.root);
        System.out.println();
        convertToSumTree(binaryTree.root);
        preorder(binaryTree.root);
    }

    private static int convertToSumTree(TreeNode<Integer> node) {
        if(node == null)
            return 0;


        int leftVal = convertToSumTree(node.left);
        int rightVal = convertToSumTree(node.right);
        int nodeValue = node.value + leftVal + rightVal;
        node.value = leftVal + rightVal;
        return nodeValue;
    }

    public static void preorder(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.value + " ");
        preorder(root.left);
        preorder(root.right);
    }

    private static BinaryTree<Integer> createTree() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();

        TreeNode<Integer> root = new TreeNode(1);
        binaryTree.root = root;

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(7);
        root.right.left.right = new TreeNode(8);

        return binaryTree;
    }
}
