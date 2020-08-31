package com.practice.ds.geeksforgeeks.tree.check;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

//https://www.geeksforgeeks.org/check-if-two-trees-are-mirror/
public class AreMirror {
    public static void main(String[] args) {
        BinaryTree tree1 = create();
        BinaryTree tree2 = createMirror();
        System.out.println("Is Mirror: " + isMirror(tree1.root, tree2.root));
    }

    private static boolean isMirror(TreeNode tree1, TreeNode tree2) {
        if (tree1 == null && tree2 == null) {
            return true;
        }

        if (tree1 == null || tree2 == null) {
            return false;
        }
        if (tree1.value == tree2.value) {
            return true;
        }

        return isMirror(tree1.left, tree2.right) && isMirror(tree1.right, tree2.right);
    }

    public static BinaryTree create() {
        BinaryTree tree = new BinaryTree();
        TreeNode root = new TreeNode(1);
        tree.root = root;


        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(4);

        return tree;
    }

    public static BinaryTree createMirror() {
        BinaryTree tree = new BinaryTree();
        TreeNode root = new TreeNode(1);
        tree.root = root;


        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        return tree;
    }
}
