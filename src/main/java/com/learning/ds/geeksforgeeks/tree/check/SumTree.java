package com.learning.ds.geeksforgeeks.tree.check;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

//https://www.geeksforgeeks.org/check-if-a-given-binary-tree-is-sumtree/
public class SumTree {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = createSumTree();
        boolean isSumTree = isSumTree(binaryTree.root);
        System.out.println(isSumTree);
    }

    private static boolean isSumTree(TreeNode<Integer> node) {
        if (node == null || (node.left == null && node.right == null)) return true;

        int leftSum = sum(node.left);
        int rightSum = sum(node.right);

        return node.value == leftSum + rightSum && (isSumTree(node.left) && isSumTree(node.right));
    }

    private static int sum(TreeNode<Integer> node) {
        if (node == null) return 0;
        return node.value + sum(node.left) + sum(node.right);
    }

    private static BinaryTree createSumTree() {
        BinaryTree tree = new BinaryTree();
        TreeNode root = new TreeNode(26);
        tree.root = root;

        root.left = new TreeNode(10);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(6);

        root.right = new TreeNode(3);
        root.right.right = new TreeNode(3);

        return tree;
    }
}
