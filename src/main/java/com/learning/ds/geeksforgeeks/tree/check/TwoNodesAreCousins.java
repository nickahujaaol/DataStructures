package com.learning.ds.geeksforgeeks.tree.check;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

//https://www.geeksforgeeks.org/check-two-nodes-cousins-binary-tree/
public class TwoNodesAreCousins {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = BinaryTree.create();
        findCousins(binaryTree.root, 2, 61);
        findCousinsRecursive(binaryTree.root, 1, 3, 0);
    }

    private static void findCousinsRecursive(TreeNode<Integer> node, int num1, int num2, int level) {
        if (node == null)
            return;

        boolean found = findInSubtree(node, num1, num2, level);
        if (found && !isSibling(node, num1, num2)) {
            System.out.println("Cousins found");
            return;
        }
        findCousinsRecursive(node.left, num1, num2, level + 1);
        findCousinsRecursive(node.right, num1, num2, level + 1);
    }

    private static boolean findInSubtree(TreeNode<Integer> node, int num1, int num2, int level) {
        int level1 = getLevel(node.left, num1, level + 1);
        int level2 = getLevel(node.right, num2, level + 1);
        return level1 == level2 && level != -1 && level2 != -1;
    }

    private static int getLevel(TreeNode<Integer> node, int num, int level) {
        if (node == null) return -1;
        if (node.value == num) {
            return level;
        }
        int foundLevel = getLevel(node.left, num, level + 1);
        if (foundLevel > 0)
            return foundLevel;
        return getLevel(node.right, num, level + 1);
    }

    private static boolean isSibling(TreeNode<Integer> node, int num1, int num2) {
        if (node == null)
            return false;
        if (node.left != null && node.right != null &&
                ((node.left.value == num1 && node.right.value == num2) ||
                        (node.right.value == num1 && node.left.value == num2))) {
            return true;
        }
        return isSibling(node.left, num1, num2) && isSibling(node.right, num1, num2);
    }


    private static void findCousins(TreeNode<Integer> node, int num1, int num2) {
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            boolean firstNumFound = false;
            boolean secondNumFound = false;

            for (int i = 0; i < queueSize; i++) {
                TreeNode<Integer> removedNode = queue.remove();
                if (removedNode.value == num1) {
                    firstNumFound = true;
                }
                if (removedNode.value == num2) {
                    secondNumFound = true;
                }

                int childNum1 = removedNode.left != null ? removedNode.left.value : 0;
                int childNum2 = removedNode.right != null ? removedNode.right.value : 0;


                if ((childNum1 == num1 && childNum2 == num2) || (childNum1 == num2 && childNum2 == num1)) {
                    System.out.println("Not Cousins. These are siblings.");
                    return;
                }
                if (removedNode.left != null)
                    queue.add(removedNode.left);
                if (removedNode.right != null)
                    queue.add(removedNode.right);
            }

            if (firstNumFound && secondNumFound) {
                System.out.println("Cousins Found....");
                return;
            } else {
                firstNumFound = false;
                secondNumFound = false;
            }
        }

        System.out.println("Numbers are not related...");
    }
}
