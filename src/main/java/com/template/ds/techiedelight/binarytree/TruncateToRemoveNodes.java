package com.template.ds.techiedelight.binarytree;

import com.learning.ds.TreeNode;

// https://www.techiedelight.com/truncate-given-binary-tree-remove-nodes-lie-path-sum-less-k/
public class TruncateToRemoveNodes {
    public static void main(String[] args) {
        TreeNode<Integer> root = createTree();
        preOrder(root);
        truncate(root, 20, 0);
        System.out.println("\n After Truncate....");
        preOrder(root);
    }

    /*
     * If we reach leaf and the sum is less than required, delete that leaf from the parent - left or right
     * If both the leaves are removed that means we need to remove the parent also and
     * hence the return is left delete + right delete.
     */
    private static boolean truncate(TreeNode<Integer> node, int sum, int sumSoFar) {
        return false;
    }

    private static TreeNode<Integer> createTree() {
        TreeNode<Integer> root = new TreeNode(6);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(2);
        root.right.left.left = new TreeNode(1);
        root.right.left.right = new TreeNode(7);
        root.right.right.right = new TreeNode(3);

        return root;
    }

    private static void preOrder(TreeNode node) {
        if (node == null) return;
        System.out.print(" " + node.value);
        preOrder(node.left);
        preOrder(node.right);
    }
}
