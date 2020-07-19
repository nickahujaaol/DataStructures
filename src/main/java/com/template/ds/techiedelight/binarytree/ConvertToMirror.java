package com.template.ds.techiedelight.binarytree;

import com.learning.ds.TreeNode;

// https://www.techiedelight.com/convert-binary-tree-to-its-mirror/
public class ConvertToMirror {
    public static void main(String[] args) {
        TreeNode<Integer> root = createTree();
        TreeNode<Integer> newRoot = new TreeNode<>(root.value);
        convertNew(root, newRoot);
        print(root);
        System.out.println();
        print(newRoot);

        convertInPlace(root);
        System.out.println();
        print(root);
    }

    private static void convertInPlace(TreeNode<Integer> node) {

    }

    private static void convertNew(TreeNode<Integer> node, TreeNode<Integer> newNode) {

    }

    private static void print(TreeNode<Integer> node) {
        if(node == null) return;
        System.out.print(" " + node.value);
        print(node.left);
        print(node.right);
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
