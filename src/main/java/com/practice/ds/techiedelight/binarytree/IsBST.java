package com.practice.ds.techiedelight.binarytree;

import com.learning.ds.TreeNode;

// https://www.techiedelight.com/determine-given-binary-tree-is-a-bst-or-not/
public class IsBST {
    public static void main(String[] args) {
        boolean isBst = isBST(createTree(), Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println("Is BST: " + isBst);
    }

    private static boolean isBST(TreeNode<Integer> node, int minKey, int maxKey) {
        if(node == null)
            return true;

        if(node.value < minKey || node.value > maxKey)
            return false;

        if((node.left != null && node.left.value > node.value) ||
                (node.right != null && node.right.value < node.value))
            return false;

        return isBST(node.left, minKey, node.value) &&
                    isBST(node.right, node.value, maxKey);
    }

    private static TreeNode<Integer> createTree() {
        TreeNode<Integer> root = new TreeNode(20);
        root.left = new TreeNode(10);
        root.right = new TreeNode(30);
        root.right.left = new TreeNode(25);
        root.right.right = new TreeNode(40);

        return root;
    }
}
