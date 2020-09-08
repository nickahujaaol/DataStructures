package com.learning.ds.geeksforgeeks.tree.misc;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

import java.util.concurrent.atomic.AtomicInteger;

//https://www.geeksforgeeks.org/diameter-of-a-binary-tree/
public class FindDiameter {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = BinaryTree.create();
        binaryTree.root.right.right.right.right = new TreeNode<>(15);
        binaryTree.root.right.right.right.right.right = new TreeNode<>(16);

        AtomicInteger maxDiameter = new AtomicInteger(0);
        findDiameter(binaryTree.root, maxDiameter);
        System.out.println(maxDiameter);
    }

    private static int findDiameter_NOt_Good(TreeNode<Integer> node) {
        return findHeight(node.left) + findHeight(node.right) + 1;
    }

    private static int findDiameter(TreeNode<Integer> node, AtomicInteger maxDiameter) {
        if(node == null)
            return 0;

        int leftLength = findDiameter(node.left, maxDiameter);
        int rightLength = findDiameter(node.right, maxDiameter);
        int tempMaxDiameter = leftLength + rightLength + 1;
        maxDiameter.set(Math.max(maxDiameter.get(), tempMaxDiameter));
        return 1 + Math.max(leftLength, rightLength);
    }


    private static int findHeight(TreeNode<Integer> node) {
        if (node == null) return 0;
        int leftHeight = findHeight(node.left);
        int rightHeight = findHeight(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
