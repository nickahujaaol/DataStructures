package com.learning.ds.geeksforgeeks.tree.traversals;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//https://www.geeksforgeeks.org/diagonal-traversal-of-binary-tree/
public class DiagonalTraversal {
    public static void main(String[] args) {
        HashMap<Integer, List<Integer>> diagMap = new HashMap<>();
        BinaryTree binaryTree = BinaryTree.create();
        diagonalTraverse(binaryTree.root, diagMap, 1);
        System.out.println(diagMap);
    }

    private static void diagonalTraverse(TreeNode<Integer> node, HashMap<Integer, List<Integer>> diagMap, int diagonal) {
        if(node == null) return;

        addElement(node, diagMap, diagonal);
        diagonalTraverse(node.left, diagMap, diagonal + 1);
        diagonalTraverse(node.right, diagMap, diagonal);
    }

    private static void addElement(TreeNode<Integer> node, HashMap<Integer, List<Integer>> diagMap, int diagonal){
        List<Integer> tempList = diagMap.get(diagonal);
        if(tempList == null) {
            tempList = new ArrayList<Integer>();
            diagMap.put(diagonal, tempList);
        }
        tempList.add(node.value);
    }
}
