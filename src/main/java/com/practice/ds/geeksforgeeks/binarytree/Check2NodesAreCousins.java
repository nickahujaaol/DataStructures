package com.practice.ds.geeksforgeeks.binarytree;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

// https://www.techiedelight.com/determine-two-nodes-are-cousins/
public class Check2NodesAreCousins {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = createTree();
        System.out.println("Are Cousins: " + areCousins(binaryTree.root, 5, 4));
    }

    private static boolean areCousins(TreeNode<Integer> node, int num1, int num2) {
        if (!isSibling(node, num1, num2) &&
                getLevel(node, num1, 0) == getLevel(node, num2, 0)) {
            return true;
        }
        return false;
    }

    private static int getLevel(TreeNode<Integer> node, int num, int level) {
        if (node == null) return 0;
        if (node.value == num) return level;

        int leftLevel = getLevel(node.left, num, level + 1);
        if (leftLevel > 0) return leftLevel;
        return getLevel(node.right, num, level + 1);
    }

    private static boolean isSibling(TreeNode<Integer> node, int num1, int num2) {
        if (node == null) return false;
        System.out.println(node);
        if (node.left != null && node.right != null &&
                ((node.left.value == num1 && node.right.value == num2) ||
                        (node.right.value == num1 && node.left.value == num2))) {
            return true;
        }
        return isSibling(node.left, num1, num2) || isSibling(node.right, num1, num2);
    }


    private static BinaryTree<Integer> createTree() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        TreeNode<Integer> root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        binaryTree.root = root;
        return binaryTree;
    }
}
