package com.practice.ds.geeksforgeeks.tree.misc;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

import java.util.concurrent.atomic.AtomicInteger;

//https://www.geeksforgeeks.org/diameter-of-a-binary-tree/
// O(n) solution... above article provide solution of O(n2)
public class FindDiameter {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = BinaryTree.create();
        binaryTree.root.right.right.right.right = new TreeNode<>(15);
        binaryTree.root.right.right.right.right.right = new TreeNode<>(16);

        AtomicInteger maxDiameter = new AtomicInteger(0);
        findDiameter(binaryTree.root, maxDiameter);
        System.out.println(maxDiameter);
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
}
