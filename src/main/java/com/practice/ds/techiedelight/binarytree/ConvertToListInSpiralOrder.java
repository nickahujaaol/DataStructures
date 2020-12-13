package com.practice.ds.techiedelight.binarytree;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//https://www.techiedelight.com/convert-binary-tree-into-doubly-linked-list/
// READ THE EXPLANATION... IT IS GOOD :-)

public class ConvertToListInSpiralOrder {
    public static void main(String[] args) {
        convert(createTree().root);
    }

    private static void convert(TreeNode<Integer> node) {
        Stack<TreeNode<Integer>> leftToRightStack = new Stack<>();
        Stack<TreeNode<Integer>> rightToLeftStack = new Stack<>();
        leftToRightStack.push(node);
        boolean flag = true;
        while (!leftToRightStack.isEmpty() || !rightToLeftStack.isEmpty()) {
            if(flag) {
                if (!leftToRightStack.isEmpty()) {
                    TreeNode<Integer> tempNode = leftToRightStack.pop();
                    System.out.print(" " + tempNode.value);
                    if (tempNode.left != null)
                        rightToLeftStack.push(tempNode.left);
                    if (tempNode.right != null)
                        rightToLeftStack.push(tempNode.right);
                } else {
                    flag = !flag;
                }
            }

            if(!flag) {
                if (!rightToLeftStack.isEmpty()) {
                    TreeNode<Integer> tempNode = rightToLeftStack.pop();
                    System.out.print(" " + tempNode.value);
                    if (tempNode.right != null)
                        leftToRightStack.push(tempNode.right);
                    if (tempNode.left != null)
                        leftToRightStack.push(tempNode.left);
                }else {
                    flag = !flag;
                }
            }
        }

    }

    private static BinaryTree<Integer> createTree() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();

        TreeNode<Integer> root = new TreeNode(1);
        binaryTree.root = root;

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        return binaryTree;
    }
}
