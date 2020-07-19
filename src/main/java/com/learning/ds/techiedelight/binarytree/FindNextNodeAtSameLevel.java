package com.learning.ds.techiedelight.binarytree;

import com.learning.ds.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

// https://www.techiedelight.com/find-next-node-in-same-level-binary-tree/
public class FindNextNodeAtSameLevel {
    public static void main(String[] args) {
        TreeNode<Integer> nextNode = findNextNode(createTree(), 7);
        System.out.println("Next Node is : " + (nextNode != null ? nextNode.value : null));
    }

    private static TreeNode<Integer> findNextNode(TreeNode<Integer> node, int fromNode) {
        TreeNode<Integer> nextNode = null;
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            int qSize = queue.size();
            for(int i = 0; i < qSize; i++) {
                TreeNode<Integer> tempNode = queue.poll();
                if(tempNode.value == fromNode && !queue.isEmpty()) {
                    nextNode = queue.poll();
                    return nextNode;
                }
                if(tempNode.left != null)
                    queue.add(tempNode.left);
                if(tempNode.right != null)
                    queue.add(tempNode.right);
            }
        }

        return nextNode;
    }

    private static TreeNode<Integer> createTree() {
        TreeNode<Integer> root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        return root;
    }
}
