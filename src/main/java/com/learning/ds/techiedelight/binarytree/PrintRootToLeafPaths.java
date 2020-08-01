package com.learning.ds.techiedelight.binarytree;

import com.learning.ds.TreeNode;

import java.util.ArrayList;
import java.util.List;

// https://www.techiedelight.com/print-all-paths-from-root-to-leaf-nodes-binary-tree/
public class PrintRootToLeafPaths {
    public static void main(String[] args) {
        TreeNode<Integer> root = createTree();
        printPaths(root, new ArrayList<Integer>());
    }

    private static void printPaths(TreeNode<Integer> node, List<Integer> paths) {
        if(node == null) return;

        paths.add(node.value);
        if(node.left == null && node.right == null) {
            System.out.println(paths);
        }

        printPaths(node.left, paths);
        printPaths(node.right, paths);
        paths.remove(paths.size() - 1);
    }

    private static TreeNode<Integer> createTree() {
        TreeNode<Integer> root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.left.left = new TreeNode(8);
        root.right.right.right = new TreeNode(9);

        return root;
    }
}
