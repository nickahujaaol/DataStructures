package com.template.ds.leetcode;

import com.learning.ds.TreeNode;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class L113_PathSum {
    public static void main(String[] args) {
        TreeNode<Integer> node = createTree();
        ArrayList<Integer> workingList = new ArrayList<>();
        ArrayList<ArrayList<Integer>> resultsList = new ArrayList<>();
        AtomicInteger workingSum = new AtomicInteger(0);
        findPaths(node, 22, workingList, resultsList, workingSum);
        System.out.println(resultsList);
    }

    private static void findPaths(TreeNode<Integer> node,
                                  int sum,
                                  ArrayList<Integer> workingList,
                                  ArrayList<ArrayList<Integer>> resultsList,
                                  AtomicInteger workingSum) {

    }


    private static TreeNode<Integer> createTree() {
        TreeNode<Integer> root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);

        return root;
    }
}
