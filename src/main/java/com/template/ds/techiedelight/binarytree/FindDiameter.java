package com.template.ds.techiedelight.binarytree;

import com.learning.ds.TreeNode;

import java.util.concurrent.atomic.AtomicInteger;

// https://www.techiedelight.com/find-diameter-of-a-binary-tree/
public class FindDiameter {

    public static void main(String[] args) {
        TreeNode<Integer> root = createTree();
        AtomicInteger diameter = new AtomicInteger();
        findDiameter(root, diameter);
        System.out.println("Diameter is: " + diameter.get());
    }

    private static int findDiameter(TreeNode<Integer> node, AtomicInteger diameter) {
        return 0;
    }

    private static TreeNode<Integer> createTree() {
        TreeNode<Integer> root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(7);
        root.right.left.right = new TreeNode(8);

        return root;
    }
}
