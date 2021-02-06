package com.finalprep.binarytree;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

//https://www.geeksforgeeks.org/check-if-a-given-binary-tree-is-sumtree/
public class SumTree {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = createSumTree();
        int sum = isSumTree(binaryTree.root);
        System.out.println(sum == 2 * binaryTree.root.value);
    }

    private static int isSumTree(TreeNode<Integer> node) {
        if(node == null)
            return 0;
        if(node.left == null && node.right == null)
            return node.value;

        if(node.value == (isSumTree(node.left) + isSumTree(node.right))) {
            return 2 * node.value;
        }

        return Integer.MAX_VALUE;
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
