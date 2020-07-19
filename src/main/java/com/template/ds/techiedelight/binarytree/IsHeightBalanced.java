package com.template.ds.techiedelight.binarytree;

// https://www.techiedelight.com/check-given-binary-tree-is-height-balanced-not/

import com.learning.ds.TreeNode;

import java.util.concurrent.atomic.AtomicBoolean;

// MAKE SURE YOUR SOLUTION IS NOT 0(N2)
public class IsHeightBalanced {
    public static void main(String[] args) {
        TreeNode<Integer> root = createTree();
        AtomicBoolean balanced = new AtomicBoolean(true);
        isHeightBalanced(root, balanced);
        System.out.println("Is Balanced : " + balanced.get());
    }

    private static int isHeightBalanced(TreeNode<Integer> node, AtomicBoolean balanced) {
        return 0;
    }

    private static TreeNode<Integer> createTree() {
        TreeNode<Integer> root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        //root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);

        root.right.left.left = new TreeNode(7);
        root.right.left.right = new TreeNode(8);

        return root;
    }
}
