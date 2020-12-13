package com.practice.ds.techiedelight.binarytree;

import com.learning.ds.TreeNode;

// https://www.techiedelight.com/check-given-binary-tree-symmetric-structure-not/
public class IsSymmetric {
    public static void main(String[] args) {
        boolean isS = isSymmetric(createTree1(), createTree2());
        System.out.println("Symmetric: " + isS);
    }

    private static boolean isSymmetric(TreeNode<Integer> leftNode, TreeNode<Integer> rightNode) {
        if((leftNode == null && rightNode != null) ||(leftNode != null && rightNode == null))
            return false;

        if(leftNode == null && rightNode == null)
            return true;

        return isSymmetric(leftNode.left, rightNode.right) && isSymmetric(leftNode.right, rightNode.left);
    }

    private static TreeNode<Integer> createTree1() {
        TreeNode<Integer> root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        return root;
    }

    private static TreeNode<Integer> createTree2() {
        TreeNode<Integer> root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        //root.right.right.right = new TreeNode(4);
        return root;
    }
}
