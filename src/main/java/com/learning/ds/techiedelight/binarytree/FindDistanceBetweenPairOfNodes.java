package com.learning.ds.techiedelight.binarytree;

import com.learning.ds.Node;
import com.learning.ds.TreeNode;

import java.util.concurrent.atomic.AtomicInteger;

// https://www.techiedelight.com/distance-between-given-pairs-of-nodes-binary-tree/
public class FindDistanceBetweenPairOfNodes {
    public static void main(String[] args) {
        AtomicInteger distance = new AtomicInteger();
        findDistance(createTree(), distance, 7, 6);
        System.out.println("Distance is: " + distance.get());
    }

    private static boolean findDistance(TreeNode<Integer> node, AtomicInteger distance, int node1, int node2) {
        return false;
    }

    private static TreeNode<Integer> createTree(){
        TreeNode<Integer> root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(7);
        root.right.right.right = new TreeNode(8);

        return root;
    }
}
