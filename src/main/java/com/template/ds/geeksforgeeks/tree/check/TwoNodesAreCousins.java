package com.template.ds.geeksforgeeks.tree.check;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

//https://www.geeksforgeeks.org/check-two-nodes-cousins-binary-tree/
public class TwoNodesAreCousins {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = BinaryTree.create();
        findCousinsRecursive(binaryTree.root, 1, 3, 0);
    }

    private static void findCousinsRecursive(TreeNode<Integer> node, int num1, int num2, int level) {

    }
}
