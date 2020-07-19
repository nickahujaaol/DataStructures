package com.learning.ds.techiedelight.binarytree;

import com.learning.ds.BinaryTree;
import com.learning.ds.TreeNode;

import java.util.Stack;

//https://www.techiedelight.com/convert-binary-tree-into-doubly-linked-list/
// READ THE EXPLANATION... IT IS GOOD :-)

public class ConvertToListInSpiralOrder {
    public static void main(String[] args) {
        convert(createTree().root);
    }

    private static void convert(TreeNode<Integer> node) {
        Stack<TreeNode<Integer>> leftToRightStack = new Stack();
        Stack<TreeNode<Integer>> rightToLeftStack = new Stack();
        rightToLeftStack.add(node);
        boolean isOddLevel = true;

        while (!leftToRightStack.isEmpty() || !rightToLeftStack.isEmpty()) {
            if(isOddLevel) {
                TreeNode<Integer> tempNode = rightToLeftStack.pop();
                System.out.print(" " + tempNode.value);
                if(tempNode.right != null) {
                    leftToRightStack.push(tempNode.right);
                }
                if(tempNode.left != null) {
                    leftToRightStack.push(tempNode.left);
                }

                if(rightToLeftStack.isEmpty()) isOddLevel = !isOddLevel;
            } else {
                TreeNode<Integer> tempNode = leftToRightStack.pop();
                System.out.print(" " + tempNode.value);
                if(tempNode.left != null) {
                    rightToLeftStack.push(tempNode.left);
                }
                if(tempNode.right != null) {
                    rightToLeftStack.push(tempNode.right);
                }
                if(leftToRightStack.isEmpty()) isOddLevel = !isOddLevel;
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
