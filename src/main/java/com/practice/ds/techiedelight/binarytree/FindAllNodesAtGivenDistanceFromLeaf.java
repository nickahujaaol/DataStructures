package com.practice.ds.techiedelight.binarytree;

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

        findNodes(root, nodesAtDistance, 3, 0);
        System.out.println(nodesAtDistance);
    }

    private static void findNodes(TreeNode<Integer> node, Set<Integer> nodesAtDistance, int distance, int level) {

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
