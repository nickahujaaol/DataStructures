package com.practice.ds.geeksforgeeks.binarytree;

import com.learning.ds.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://www.techiedelight.com/find-all-nodes-at-given-distance-from-leaf-nodes-in-a-binary-tree/
public class FindAllNodesAtGivenDistanceFromLeaf {
    public static void main(String[] args) {
        TreeNode<Integer> root = createTree();
        List<Integer> rootToLeafPath = new ArrayList<>();
        Set<Integer> nodesAtDistance = new HashSet<>();

        findNodes(root, rootToLeafPath, nodesAtDistance, 1);
        System.out.println(nodesAtDistance);
    }

    private static int findNodes(TreeNode<Integer> node, List<Integer> rootToLeafPath, Set<Integer> nodesAtDistance, int distance) {
        if(node == null) return 0;
        if(node.left == null && node.right == null) return 1;

        int leftDistance = findNodes(node.left, rootToLeafPath, nodesAtDistance, distance);
        if(leftDistance == distance) {
            System.out.print(" " + node.value);
        }
        int rightDistance = findNodes(node.right, rootToLeafPath, nodesAtDistance, distance);
        if(rightDistance == distance) {
            System.out.print(" " + node.value);
        }

        if(leftDistance > 0) return leftDistance + 1;
        if(rightDistance > 0) return rightDistance + 1;
        return 0;
    }

    private static TreeNode<Integer> createTree() {
        TreeNode<Integer> root = new TreeNode(15);
        root.left = new TreeNode(10);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(12);
        root.right.left = new TreeNode(16);
        root.right.right = new TreeNode(25);
        root.right.left.left = new TreeNode(18);

        return root;
    }
}
