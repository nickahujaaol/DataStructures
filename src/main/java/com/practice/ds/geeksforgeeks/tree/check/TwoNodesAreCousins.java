package com.practice.ds.geeksforgeeks.tree.check;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

//https://www.geeksforgeeks.org/check-two-nodes-cousins-binary-tree/
public class TwoNodesAreCousins {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = BinaryTree.create();
        boolean areCousins = findCousinsRecursive(binaryTree.root, 7, 3);
        System.out.println(areCousins);
    }

    private static boolean findCousinsRecursive(TreeNode<Integer> node, int num1, int num2) {
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            boolean num1Found = false;
            boolean num2Found = false;
            for (int i = 0; i < queueSize; i++) {
                TreeNode<Integer> tempNode = queue.poll();
                if(isSibling(tempNode, num1, num2))
                    return false;
                if(!num1Found)
                    num1Found = tempNode.value == num1;
                if(!num2Found)
                    num2Found = tempNode.value == num2;

                if(num1Found && num2Found)
                    return true;

                if(tempNode.left != null)
                    queue.add(tempNode.left);
                if(tempNode.right != null)
                    queue.add(tempNode.right);

            }
        }
        return false;
    }

    private static boolean isSibling(TreeNode<Integer> node, int num1, int num2) {
        if (node == null)
            return false;
        if (node.left != null && node.right != null &&
                ((node.left.value == num1 && node.right.value == num2) ||
                        (node.right.value == num1 && node.left.value == num2))) {
            return true;
        }
        return false;
    }
}
