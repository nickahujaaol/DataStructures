package com.practice.ds.techiedelight.binarytree;

import com.learning.ds.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;

// https://www.techiedelight.com/find-diagonal-sum-given-binary-tree/
public class FindDiagonalSum {
    public static void main(String[] args) {
        TreeNode<Integer> root = createTree();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        findSum(root, map, 0);
        System.out.println(map);
    }

    private static void findSum(TreeNode<Integer> node, HashMap<Integer, ArrayList<Integer>> map, int diagNumber) {
        if(node == null)
            return;

        map.putIfAbsent(diagNumber, new ArrayList<Integer>());
        map.get(diagNumber).add(node.value);
        findSum(node.left, map, diagNumber + 1);
        findSum(node.right, map, diagNumber);
    }

    private static TreeNode<Integer> createTree() {
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
