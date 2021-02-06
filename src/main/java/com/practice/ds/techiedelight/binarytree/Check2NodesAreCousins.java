package com.practice.ds.techiedelight.binarytree;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

// https://www.techiedelight.com/determine-two-nodes-are-cousins/
public class Check2NodesAreCousins {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = createTree();
        System.out.println("Are Cousins: " + areCousins(binaryTree.root, 5, 6));
    }

    private static boolean areCousins(TreeNode<Integer> node, int num1, int num2) {
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            boolean num1Found = false;
            boolean num2Found = false;

            for(int i = 0; i < queueSize; i++) {
                TreeNode<Integer> tempNode = queue.poll();
                if(isSibling(tempNode, num1, num2)) {
                    System.out.println("Nums are Siblings");
                    return false;
                }

                if(tempNode.left != null)
                    queue.add(tempNode.left);
                if(tempNode.right != null)
                    queue.add(tempNode.right);

                if(tempNode.value == num1) {
                    num1Found = true;
                }
                if(tempNode.value == num2) {
                    num2Found = true;
                }

                if(num1Found && num2Found) {
                    System.out.println("Nums are cousins");
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean isSibling(TreeNode<Integer> node, int num1, int num2) {
        if(node.left != null &&
                node.right != null &&
                ((node.left.value == num1 && node.right.value == num2) ||
                (node.left.value == num2 && node.right.value == num1))) {
            return true;
        }

        return false;
    }


    private static BinaryTree<Integer> createTree() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        TreeNode<Integer> root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        binaryTree.root = root;
        return binaryTree;
    }
}
