package com.template.ds.techiedelight.binarytree;

import com.learning.ds.TreeNode;

// https://www.techiedelight.com/check-given-binary-tree-symmetric-structure-not/
public class IsSymmetric {
    public static void main(String[] args) {
        TreeNode<Integer> root = createTree();
        boolean isS = isSymmetric(root.left, root.right);
        System.out.println("Symmetric: " + isS);
    }

    private static boolean isSymmetric(TreeNode<Integer> leftNode, TreeNode<Integer> rightNode) {
        return false;
    }

    private static TreeNode<Integer> createTree() {
        TreeNode<Integer> root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(5);

        return root;
    }
}
