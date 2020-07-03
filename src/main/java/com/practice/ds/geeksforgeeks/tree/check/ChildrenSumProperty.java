package com.practice.ds.geeksforgeeks.tree.check;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

//https://www.geeksforgeeks.org/check-for-children-sum-property-in-a-binary-tree/
public class ChildrenSumProperty {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = createSumTree();
        boolean isSumTree = isSumTree(binaryTree.root);
        System.out.println(isSumTree);
    }

    private static boolean isSumTree(TreeNode<Integer> node) {
        return false;
    }

    private static BinaryTree createSumTree() {
        BinaryTree tree = new BinaryTree();
        TreeNode root = new TreeNode(10);
        tree.root = root;

        root.left = new TreeNode(8);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(5);

        root.right = new TreeNode(2);
        root.right.left = new TreeNode(2);
        return tree;
    }
}
